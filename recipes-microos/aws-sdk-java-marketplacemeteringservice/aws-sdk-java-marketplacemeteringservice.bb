SUMMARY = "AWS Java SDK for AWS Marketplace Metering Service"
DESCRIPTION = "The AWS Java SDK for AWS Marketplace Metering Service module \
holds the client classes that are used for communicating with \
AWS Marketplace Metering Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-marketplacemeteringservice-1.11.3-7.8.noarch.rpm"
RPM_HASH = "c22ebc29008295a300dec2e2878a4875c5ef2e9a18c3af6bf2d0ec749c944c95228b4c00cf53670bfe8a54b5794ef5f8ea859ba9387308a78d2b9ecf35a63271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-marketplacemeteringservice \
mvn(com.amazonaws:aws-java-sdk-marketplacemeteringservice) \
mvn(com.amazonaws:aws-java-sdk-marketplacemeteringservice:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
