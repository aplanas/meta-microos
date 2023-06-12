SUMMARY = "AWS Java SDK for AWS Support"
DESCRIPTION = "The AWS Java SDK for AWS Support module holds the \
client classes that are used for communicating with \
AWS Support Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-support-1.11.3-7.8.noarch.rpm"
RPM_HASH = "496070d2e8693a7f3f286939d1840917c1bcb7a798686acbd14ee132ad73680b78cb600c4d1288a64e4fa01066a23821f35a41e183795f3497cb85e12bdc3fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-support \
mvn(com.amazonaws:aws-java-sdk-support) \
mvn(com.amazonaws:aws-java-sdk-support:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
