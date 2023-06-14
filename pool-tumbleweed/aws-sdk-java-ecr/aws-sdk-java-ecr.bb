SUMMARY = "AWS Java SDK for the Amazon EC2 Container Registry"
DESCRIPTION = "The AWS Java SDK for the Amazon EC2 Container Registry \
holds the client classes that are used for communicating \
with the Amazon EC2 Container Registry Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ecr-1.11.3-7.8.noarch.rpm"
RPM_HASH = "731416228f8f684a78b91b7e9472aa4677aad429944d3fba32e76b5658a537e89ab6635d113ddb9396d9cf686f1cd791261c0807c950a19ba500928732025c7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ecr \
mvn-com.amazonaws-aws-java-sdk-ecr \
mvn-com.amazonaws-aws-java-sdk-ecr-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
