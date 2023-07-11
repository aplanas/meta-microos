SUMMARY = "AWS Java SDK for the AWS Simple Systems Management (SSM) Service"
DESCRIPTION = "The AWS Java SDK for AWS Simple Systems Management Service \
holds the client classes that are used for communicating \
with the AWS Simple Systems Management Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ssm-1.11.3-7.9.noarch.rpm"
RPM_HASH = "6d17aeca6b397c27f7d6ceab4c1becf8d540086c1df28a3832be2dd9218389e5394a6d2a0183dd2591be84edfe5d3322ca6f27172e68fba0f6c990a579f6e15b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ssm \
mvn-com.amazonaws-aws-java-sdk-ssm \
mvn-com.amazonaws-aws-java-sdk-ssm-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
