SUMMARY = "AWS Java SDK for Amazon EMR"
DESCRIPTION = "The AWS Java SDK for Amazon EMR module holds the \
client classes that are used for communicating \
with Amazon Elastic MapReduce Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-emr-1.11.3-7.8.noarch.rpm"
RPM_HASH = "78bb79060157f7e0030d60118730bde0496a7df72495243a61fdb6d790598aafc76de7527e42cf64632f1a74e3a9782941b75f6ecc7e84a2c7df847aa299af2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-emr \
mvn(com.amazonaws:aws-java-sdk-emr) \
mvn(com.amazonaws:aws-java-sdk-emr:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
