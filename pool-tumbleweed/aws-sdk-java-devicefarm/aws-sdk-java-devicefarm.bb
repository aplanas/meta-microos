SUMMARY = "AWS Java SDK for AWS Device Farm"
DESCRIPTION = "The AWS Java SDK for AWS Device Farm module \
holds the client classes that are used for \
communicating with AWS Device Farm."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-devicefarm-1.11.3-7.8.noarch.rpm"
RPM_HASH = "737cb18b66ac6f1f6752e66e4151359f0a54ff3a40f1b6ae8d612f69d32d59e39778d4cc895854fc44ad0751a243f750638f381e418a7ab3c90b4097eb197272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-devicefarm \
mvn(com.amazonaws:aws-java-sdk-devicefarm) \
mvn(com.amazonaws:aws-java-sdk-devicefarm:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
