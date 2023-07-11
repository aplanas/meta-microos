SUMMARY = "AWS Java SDK for Amazon SNS"
DESCRIPTION = "The AWS Java SDK for Amazon SNS module holds the \
client classes that are used for communicating with \
Amazon Simple Notification Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-sns-1.11.3-7.9.noarch.rpm"
RPM_HASH = "8e4b2b23cff8c64d28424ee29a7024786dec8a40b772fe55238cb6416dec84b8125ded0d3c88d76efc92b2a7d4a40e91c734dc66e5220b5b3d1ba7f72ecbb0d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-sns \
mvn-com.amazonaws-aws-java-sdk-sns \
mvn-com.amazonaws-aws-java-sdk-sns-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-sqs"

inherit rpm
