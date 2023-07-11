SUMMARY = "AWS Java SDK for the Amazon EC2 Container Registry"
DESCRIPTION = "The AWS Java SDK for the Amazon EC2 Container Registry \
holds the client classes that are used for communicating \
with the Amazon EC2 Container Registry Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ecr-1.11.3-7.9.noarch.rpm"
RPM_HASH = "c636e66c5437521708d99e588ade5fbd46c272a53dc614dcc7e3b36abc131279d4924637d4cde592f06d8c22ed3ec56f54adba11a49f3b126c65c6558cc7fefc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ecr \
mvn-com.amazonaws-aws-java-sdk-ecr \
mvn-com.amazonaws-aws-java-sdk-ecr-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
