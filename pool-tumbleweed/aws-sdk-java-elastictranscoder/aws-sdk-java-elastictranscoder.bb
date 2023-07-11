SUMMARY = "AWS Java SDK for Amazon Elastic Transcoder"
DESCRIPTION = "The AWS Java SDK for Amazon Elastic Transcoder module \
holds the client classes that are used for communicating \
with Amazon Elastic Transcoder Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elastictranscoder-1.11.3-7.9.noarch.rpm"
RPM_HASH = "742fb3b543917c4f67a6284befe4b7a05f39729d59b83caaa0d9c69a6a09ff60d6c90c80b32bce7f30c1188c7f218a653ccc8de0cbca3d950d7f76642deaf4b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elastictranscoder \
mvn-com.amazonaws-aws-java-sdk-elastictranscoder \
mvn-com.amazonaws-aws-java-sdk-elastictranscoder-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
