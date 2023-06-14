SUMMARY = "AWS Java SDK for Amazon Elastic Transcoder"
DESCRIPTION = "The AWS Java SDK for Amazon Elastic Transcoder module \
holds the client classes that are used for communicating \
with Amazon Elastic Transcoder Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elastictranscoder-1.11.3-7.8.noarch.rpm"
RPM_HASH = "131e3b50e127d36ce1ee425ebd73db1e5f142dd6918846d51cafe2268c6b602dc8aac14c2706185a444ca0d664de5cd2e7e1b8cdb013e08801941523b3a639b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elastictranscoder \
mvn-com.amazonaws-aws-java-sdk-elastictranscoder \
mvn-com.amazonaws-aws-java-sdk-elastictranscoder-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
