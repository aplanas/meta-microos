SUMMARY = "AWS Java SDK for AWS Config"
DESCRIPTION = "The AWS Java SDK for AWS Config module holds the \
client classes that are used for communicating with \
AWS Config Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-config-1.11.3-7.9.noarch.rpm"
RPM_HASH = "66506fc116b8a9c2443a58086838829996616754ea78750eca51d7de6297046b68433c444674d9911376e43e68f25b3d501e1580179b09e25b15993db2cf3b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-config \
mvn-com.amazonaws-aws-java-sdk-config \
mvn-com.amazonaws-aws-java-sdk-config-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
