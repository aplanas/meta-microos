SUMMARY = "AWS Java SDK for Amazon SWF"
DESCRIPTION = "The AWS Java SDK for Amazon SWF module holds the \
client classes that are used for communicating with \
Amazon Simple Workflow Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-simpleworkflow-1.11.3-7.8.noarch.rpm"
RPM_HASH = "d5b5c504113cb8e86c8ae86b7b3177f5d06a6ec70e3ae0932c0b7899c257c1ebfdc008f959338f82865ade6f438a08ad277c0b6e09b7b06cfe6b5069b6cccc39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-simpleworkflow mvn(com.amazonaws:aws-java-sdk-simpleworkflow) mvn(com.amazonaws:aws-java-sdk-simpleworkflow:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
