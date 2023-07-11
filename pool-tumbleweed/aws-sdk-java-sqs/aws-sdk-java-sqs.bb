SUMMARY = "AWS Java SDK for Amazon SQS"
DESCRIPTION = "The AWS Java SDK for Amazon SQS module holds the \
client classes that are used for communicating with \
Amazon Simple Queue Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-sqs-1.11.3-7.9.noarch.rpm"
RPM_HASH = "993ea269d5ae2d492ce0c77e32eb544ddb6b623b952da1716334db7ecee8183c4cf85675032ad0fcef2e1190db4e5a60b7ad59d3485d1b6cfb80c120595f40fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-sqs \
mvn-com.amazonaws-aws-java-sdk-sqs \
mvn-com.amazonaws-aws-java-sdk-sqs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
