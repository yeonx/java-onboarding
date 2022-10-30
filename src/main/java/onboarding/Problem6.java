package onboarding;

import java.util.*;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        return answer;
    }

    /**
     * 이메일 도메인이 @email.com 인지 확인하는 함수
     */
    private static boolean isEmailDomain(String email){
        if (!email.endsWith("@email.com"))
            return false;
        else return true;
    }

    /**
     * 이메일 전체 길이가 11자 이상 20자 미만인지 확인하는 함수 구현
     */
    private static boolean isEmailLength(String email){
        if (email.length()>=11 && email.length()<20)
            return true;
        else return false;
    }

    /**
     * 이메일이 제한 사항을 만족하는지 확인하는 함수
     */
    private static boolean isEmailValid(String email){
        if(isEmailDomain(email)&&isEmailLength(email))
            return true;
        else return false;
    }

    /**
     * 닉네임에 한글만 있는지 확인하는 함수
     */
    private static boolean isNameHangul(String nickname){
        String hangul = "^[가-힣]*$";
        if(!nickname.matches(hangul))
            return false;
        else return true;
    }

    /**
     * 닉네임의 길이가 1자 이상 20자 미만인지 확인하는 함수
     */
    private static boolean isNameLength(String nickname){
        if(nickname.length()>=1 && nickname.length()<20)
            return true;
        else return false;
    }

    /**
     * 닉네임의 제한사항 만족 여부를 확인하는 함수
     */
    private static boolean isNameValid(String nickname){
        if(isNameHangul(nickname)&&isNameLength(nickname))
            return true;
        else return false;
    }

    /**
     * 이메일 오름차순으로 정렬
     */
    private static List<String> emailOrder(List<String> emails){
        emails.sort(Comparator.naturalOrder());
        return emails;
    }
}
