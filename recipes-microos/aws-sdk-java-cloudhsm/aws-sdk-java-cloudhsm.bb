SUMMARY = "AWS Java SDK for the AWS CloudHSM"
DESCRIPTION = "The AWS Java SDK for AWS CloudHSM holds the client \
classes that are used for communicating with the \
AWS CloudHSM Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudhsm-1.11.3-7.8.noarch.rpm"
RPM_HASH = "4bb04d22da5244e10af6b6bd385e89ed055581c19bbde75f1435c31e25e662ed63d34c17c77c3e14fa08e02929e2b42ab486da0cdcd90fb195f69aaf071bcccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudhsm mvn(com.amazonaws:aws-java-sdk-cloudhsm) mvn(com.amazonaws:aws-java-sdk-cloudhsm:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
