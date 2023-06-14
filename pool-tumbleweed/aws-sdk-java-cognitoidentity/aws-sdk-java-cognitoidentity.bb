SUMMARY = "AWS Java SDK for Amazon Cognito Identity"
DESCRIPTION = "The AWS Java SDK for Amazon Cognito Identity module holds the \
client classes that are used for communicating with \
Amazon Cognito Identity Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cognitoidentity-1.11.3-7.8.noarch.rpm"
RPM_HASH = "01927ad48140fe188b832d5b0910c6d76cb219bebdda15359079ef3616470d14a1fdbb54847f38979946712f9877e8aec75f9221146550be8fa50fa520179aad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cognitoidentity \
mvn-com.amazonaws-aws-java-sdk-cognitoidentity \
mvn-com.amazonaws-aws-java-sdk-cognitoidentity-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
