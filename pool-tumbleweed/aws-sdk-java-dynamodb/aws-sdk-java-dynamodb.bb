SUMMARY = "AWS Java SDK for Amazon DynamoDB"
DESCRIPTION = "The AWS Java SDK for Amazon DynamoDB module holds the \
client classes that are used for communicating with \
Amazon DynamoDB Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-dynamodb-1.11.3-7.9.noarch.rpm"
RPM_HASH = "f23fcc57a78bb9dc9c51a60e345e3e73802ec9bd4edd3b827ec186222ac1c439007a398748039322ab16fc88ec70800a9e64370126b0eceb0314ec5a7c6425ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-dynamodb \
mvn-com.amazonaws-aws-java-sdk-dynamodb \
mvn-com.amazonaws-aws-java-sdk-dynamodb-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-s3"

inherit rpm
