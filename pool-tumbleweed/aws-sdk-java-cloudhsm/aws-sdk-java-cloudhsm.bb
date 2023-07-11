SUMMARY = "AWS Java SDK for the AWS CloudHSM"
DESCRIPTION = "The AWS Java SDK for AWS CloudHSM holds the client \
classes that are used for communicating with the \
AWS CloudHSM Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudhsm-1.11.3-7.9.noarch.rpm"
RPM_HASH = "c91b4cc11c5dcec0f4822598c2b3795260f5d13db011a45d6f6b15f57bae516e3c9f0a76cc38d86832053e11141c73c2ae650715efd5a7b9a9d107c469dc8304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudhsm \
mvn-com.amazonaws-aws-java-sdk-cloudhsm \
mvn-com.amazonaws-aws-java-sdk-cloudhsm-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
