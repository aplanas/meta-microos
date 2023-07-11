SUMMARY = "AWS Java SDK for Amazon Cognito Identity Provider Service"
DESCRIPTION = "The AWS Java SDK for Amazon Cognito Identity Provider Service module \
holds the client classes that are used for communicating with \
Amazon Cognito Identity Provider Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cognitoidp-1.11.3-7.9.noarch.rpm"
RPM_HASH = "354a14f6ae259b1ca381aad85999397bd35bbcc96708375863f909cfb8fe4a743dc548ba5eecf75b856d25b845f20a8da4609f01d5c84b8aa2e87e336881c9ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cognitoidp \
mvn-com.amazonaws-aws-java-sdk-cognitoidp \
mvn-com.amazonaws-aws-java-sdk-cognitoidp-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
