SUMMARY = "AWS Java SDK for Amazon Cognito Sync"
DESCRIPTION = "The AWS Java SDK for Amazon Cognito Sync module holds the \
client classes that are used for communicating with \
Amazon Cognito Sync Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cognitosync-1.11.3-7.8.noarch.rpm"
RPM_HASH = "9634d56614d7d65688dde0ae3ca4d4ef9e9005f895e6e32abfb468728f03951235f089cdd5700f0340892ef0162a8018a0d60ce8f3685ddee208f0e4b25b52a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cognitosync \
mvn(com.amazonaws:aws-java-sdk-cognitosync) \
mvn(com.amazonaws:aws-java-sdk-cognitosync:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
