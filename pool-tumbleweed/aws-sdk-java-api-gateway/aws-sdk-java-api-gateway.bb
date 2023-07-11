SUMMARY = "AWS Java SDK for Amazon API Gateway"
DESCRIPTION = "The AWS Java SDK for Amazon API Gateway module \
holds the client classes that are used for \
communicating with Amazon API Gateway."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-api-gateway-1.11.3-7.9.noarch.rpm"
RPM_HASH = "a225a53b613359c412460f26edf129771a9250426f8bcf69b43e9a83025a2f3795f1c85fe37e568527b31a0e84e6720f499afa8e71773bcb0ae5f77b4828c204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-api-gateway \
mvn-com.amazonaws-aws-java-sdk-api-gateway \
mvn-com.amazonaws-aws-java-sdk-api-gateway-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
