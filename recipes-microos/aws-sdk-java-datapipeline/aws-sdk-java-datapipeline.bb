SUMMARY = "AWS Java SDK for AWS Data Pipeline"
DESCRIPTION = "The AWS Java SDK for AWS Data Pipeline module holds the \
client classes that are used for communicating with \
AWS Data Pipeline Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-datapipeline-1.11.3-7.8.noarch.rpm"
RPM_HASH = "08e1151dd5a4b511f6d73d77291407771502fffa59fe117ef7bf16b667ed22ce2fe80f3b0fd294e6e0fe32abf76825323c575f42944edd5743f3e704b0697a1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-datapipeline \
mvn(com.amazonaws:aws-java-sdk-datapipeline) \
mvn(com.amazonaws:aws-java-sdk-datapipeline:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
