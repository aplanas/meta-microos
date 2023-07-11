SUMMARY = "AWS Java SDK for AWS Storage Gateway"
DESCRIPTION = "The AWS Java SDK for AWS Storage Gateway module holds the \
client classes that are used for communicating with \
AWS Storage Gateway Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-storagegateway-1.11.3-7.9.noarch.rpm"
RPM_HASH = "005b390f5ac47c9d10de55888544fa66de26febdcf83bfafa8bd79ddc5bffeb533ed822bc3dcc0b13f9980e780fb766e454756ba636dbd40648e2b1f02458a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-storagegateway \
mvn-com.amazonaws-aws-java-sdk-storagegateway \
mvn-com.amazonaws-aws-java-sdk-storagegateway-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
