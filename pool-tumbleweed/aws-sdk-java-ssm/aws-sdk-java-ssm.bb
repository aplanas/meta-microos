SUMMARY = "AWS Java SDK for the AWS Simple Systems Management (SSM) Service"
DESCRIPTION = "The AWS Java SDK for AWS Simple Systems Management Service \
holds the client classes that are used for communicating \
with the AWS Simple Systems Management Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ssm-1.11.3-7.8.noarch.rpm"
RPM_HASH = "682022553f9d32d2a8584b78d721b2e2ee9b4283609fb2ba76d990fc1353f61d7a1d01617d66e7b73f711a2bc8fbf4a1c66bb2c49f890c983c77941b8d5a8d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ssm \
mvn(com.amazonaws:aws-java-sdk-ssm) \
mvn(com.amazonaws:aws-java-sdk-ssm:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
