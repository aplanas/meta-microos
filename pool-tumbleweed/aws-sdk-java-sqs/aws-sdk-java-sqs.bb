SUMMARY = "AWS Java SDK for Amazon SQS"
DESCRIPTION = "The AWS Java SDK for Amazon SQS module holds the \
client classes that are used for communicating with \
Amazon Simple Queue Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-sqs-1.11.3-7.8.noarch.rpm"
RPM_HASH = "ea064366928db58bd5834b7d151d474b56477f901b505fb578c7d62faf30bdad7d733af216c5c37e73fffb905d89f3ead4fe9994b7bf0d091f2894d5bfd9140a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-sqs \
mvn-com.amazonaws-aws-java-sdk-sqs \
mvn-com.amazonaws-aws-java-sdk-sqs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
