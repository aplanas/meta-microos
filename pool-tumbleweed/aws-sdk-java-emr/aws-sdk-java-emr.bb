SUMMARY = "AWS Java SDK for Amazon EMR"
DESCRIPTION = "The AWS Java SDK for Amazon EMR module holds the \
client classes that are used for communicating \
with Amazon Elastic MapReduce Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-emr-1.11.3-7.9.noarch.rpm"
RPM_HASH = "a59cc9f8e63552e5e349288446e9956cd54c8fc17604825b56cfe1dae3389fa524f92e85f08cdd5799d30d99865954adccdc8aa5c614f6fc812b984023f5ef41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-emr \
mvn-com.amazonaws-aws-java-sdk-emr \
mvn-com.amazonaws-aws-java-sdk-emr-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
