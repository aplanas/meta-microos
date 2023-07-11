SUMMARY = "AWS Java SDK for Amazon RDS"
DESCRIPTION = "The AWS Java SDK for Amazon RDS module holds the \
client classes that are used for communicating with \
Amazon Relational Database Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-rds-1.11.3-7.9.noarch.rpm"
RPM_HASH = "e3f6e469de29b6c0ea225e092fd6b7004ee7aa6d26579b7463b1d1c9ab2cef153facec3af5b4ed09301c6964de776af07b53d9bc1ecc2e33c31012d6f7bea3b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-rds \
mvn-com.amazonaws-aws-java-sdk-rds \
mvn-com.amazonaws-aws-java-sdk-rds-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
