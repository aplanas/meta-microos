SUMMARY = "AWS Java SDK for Amazon CloudWatch"
DESCRIPTION = "The AWS Java SDK for Amazon CloudWatch module holds the \
client classes that are used for communicating with \
Amazon CloudWatch Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudwatch-1.11.3-7.9.noarch.rpm"
RPM_HASH = "7e672289b9e10fbc3a157be1e0b3e34c9786251e76903b628bcef380dc618a6b19b231e5dd755e74db4f20f1346512e899e6a009f4b0767354c997741e2e40f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudwatch \
mvn-com.amazonaws-aws-java-sdk-cloudwatch \
mvn-com.amazonaws-aws-java-sdk-cloudwatch-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
