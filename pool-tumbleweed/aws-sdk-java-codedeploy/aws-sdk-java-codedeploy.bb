SUMMARY = "AWS Java SDK for AWS CodeDeploy"
DESCRIPTION = "The AWS Java SDK for AWS CodeDeploy module holds the \
client classes that are used for communicating with \
AWS CodeDeploy Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-codedeploy-1.11.3-7.8.noarch.rpm"
RPM_HASH = "afa86879a7b90cbc1c47965572a573a1cde0858ba5c0a66fb65bdf0466561e59f76ba84d0a353aa7c2264b3017bc1ec56320102691674df64a13dac1b24c98b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-codedeploy \
mvn(com.amazonaws:aws-java-sdk-codedeploy) \
mvn(com.amazonaws:aws-java-sdk-codedeploy:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
