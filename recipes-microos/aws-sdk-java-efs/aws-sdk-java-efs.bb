SUMMARY = "AWS Java SDK for Amazon Elastic File System"
DESCRIPTION = "The AWS Java SDK for Amazon Elastic File System module \
holds the client classes that are used for communicating \
with Amazon Elastic File System."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-efs-1.11.3-7.8.noarch.rpm"
RPM_HASH = "61cbf920146680ab2a10acaf8f371f50e8b0e8fc42958651569f7ba8009e83b4d60a0b397457fa53dcf1abb63cba188e0bd30aafbf770a0401bbd633477b2264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-efs mvn(com.amazonaws:aws-java-sdk-efs) mvn(com.amazonaws:aws-java-sdk-efs:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
