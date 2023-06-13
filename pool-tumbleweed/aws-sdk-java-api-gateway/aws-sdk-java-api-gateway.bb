SUMMARY = "AWS Java SDK for Amazon API Gateway"
DESCRIPTION = "The AWS Java SDK for Amazon API Gateway module \
holds the client classes that are used for \
communicating with Amazon API Gateway."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-api-gateway-1.11.3-7.8.noarch.rpm"
RPM_HASH = "a1cbc9f6bd5abf204896fa4210014b8b254be9c11e2e629bf2c40f09f393031e3083f760769293a2e6b99311d10074152fd54f8e5dd3d0d7184830169b5cfb8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-api-gateway \
mvn(com.amazonaws:aws-java-sdk-api-gateway) \
mvn(com.amazonaws:aws-java-sdk-api-gateway:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
