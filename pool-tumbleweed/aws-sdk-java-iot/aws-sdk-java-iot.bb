SUMMARY = "AWS Java SDK for AWS IoT"
DESCRIPTION = "The AWS Java SDK for AWS Iot Service module holds the \
client classes that are used for communicating with \
AWS IoT Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-iot-1.11.3-7.9.noarch.rpm"
RPM_HASH = "7dd6d06a9579bdb73b8501d20c0bc4e30ccbf66bb213dca24c9f8909a5f357e48a609ea51ef94004acab7017805d0281bd99291b2b4a24e464dca041749c1489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-iot \
mvn-com.amazonaws-aws-java-sdk-iot \
mvn-com.amazonaws-aws-java-sdk-iot-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
