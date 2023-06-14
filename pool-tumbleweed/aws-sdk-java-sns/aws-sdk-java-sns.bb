SUMMARY = "AWS Java SDK for Amazon SNS"
DESCRIPTION = "The AWS Java SDK for Amazon SNS module holds the \
client classes that are used for communicating with \
Amazon Simple Notification Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-sns-1.11.3-7.8.noarch.rpm"
RPM_HASH = "d81b2430da4e4e70f9219266e7e6d81f4f05cec39b0b4a99105666687b4e49e346d7aaa46ff9b4a80d553d067d39257cb2800707ee8cfc722f69d12420da336c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-sns \
mvn-com.amazonaws-aws-java-sdk-sns \
mvn-com.amazonaws-aws-java-sdk-sns-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-sqs"

inherit rpm
