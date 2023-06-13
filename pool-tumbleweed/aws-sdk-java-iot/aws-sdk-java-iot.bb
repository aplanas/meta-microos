SUMMARY = "AWS Java SDK for AWS IoT"
DESCRIPTION = "The AWS Java SDK for AWS Iot Service module holds the \
client classes that are used for communicating with \
AWS IoT Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-iot-1.11.3-7.8.noarch.rpm"
RPM_HASH = "ce5a22c70f45acb95fa976e0713feebdec933b6e30a5cc06ce4d9e8e2747d6bd9179526e602a408089d775fdd5b5fc96bd33b826a90ab3f2bb3a87501bdb3f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-iot \
mvn(com.amazonaws:aws-java-sdk-iot) \
mvn(com.amazonaws:aws-java-sdk-iot:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
