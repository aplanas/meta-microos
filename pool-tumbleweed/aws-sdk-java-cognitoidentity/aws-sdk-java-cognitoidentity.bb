SUMMARY = "AWS Java SDK for Amazon Cognito Identity"
DESCRIPTION = "The AWS Java SDK for Amazon Cognito Identity module holds the \
client classes that are used for communicating with \
Amazon Cognito Identity Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cognitoidentity-1.11.3-7.9.noarch.rpm"
RPM_HASH = "6601747de68b7547e1546c936132351f74a8249ab3dca1f5974371d3d7e6ac7f02b0b17d13144aeb222188524cb1f7f804efe41a5de90b4d0d96fecfc69e9431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cognitoidentity \
mvn-com.amazonaws-aws-java-sdk-cognitoidentity \
mvn-com.amazonaws-aws-java-sdk-cognitoidentity-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
