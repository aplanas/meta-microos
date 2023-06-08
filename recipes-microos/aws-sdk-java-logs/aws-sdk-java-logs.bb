SUMMARY = "AWS Java SDK for Amazon CloudWatch Logs"
DESCRIPTION = "The AWS Java SDK for Amazon CloudWatch Logs module \
holds the client classes that are used for communicating \
with Amazon CloudWatch Logs Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-logs-1.11.3-7.8.noarch.rpm"
RPM_HASH = "28a682a8886ac51eaf3105c0ebe28b6ef333339c04fa9bd820dba65867f494a2a6e0dd5527fd47b976477201b82c260dfd5033a81077cfd2a82ac0bef58cf820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-logs mvn(com.amazonaws:aws-java-sdk-logs) mvn(com.amazonaws:aws-java-sdk-logs:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
