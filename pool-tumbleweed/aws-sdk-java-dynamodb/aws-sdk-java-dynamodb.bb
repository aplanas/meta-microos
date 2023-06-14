SUMMARY = "AWS Java SDK for Amazon DynamoDB"
DESCRIPTION = "The AWS Java SDK for Amazon DynamoDB module holds the \
client classes that are used for communicating with \
Amazon DynamoDB Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-dynamodb-1.11.3-7.8.noarch.rpm"
RPM_HASH = "4ef4c69879e3170d90f3022296b04807ab2b47c80c58a770bcc3be219023494620165cb8dc322c4f3926dbd1b264c677a84864ff29a1e4f292180f259d58fade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-dynamodb \
mvn-com.amazonaws-aws-java-sdk-dynamodb \
mvn-com.amazonaws-aws-java-sdk-dynamodb-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-s3"

inherit rpm
