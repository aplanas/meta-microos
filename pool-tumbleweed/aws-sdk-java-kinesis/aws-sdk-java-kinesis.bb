SUMMARY = "AWS Java SDK for Amazon Kinesis"
DESCRIPTION = "The AWS Java SDK for Amazon Kinesis module holds the \
client classes that are used for communicating with \
Amazon Kinesis Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-kinesis-1.11.3-7.9.noarch.rpm"
RPM_HASH = "9e46ad5d0388e15814e414653f7c7a34b5e6d994f1c755bf8872d3dc3f4df5c91c9d07cdbf9ca40e2d574752eb6a6cddfafe20b802b02353d236164929c04b1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-kinesis \
mvn-com.amazonaws-aws-java-sdk-kinesis \
mvn-com.amazonaws-aws-java-sdk-kinesis-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
