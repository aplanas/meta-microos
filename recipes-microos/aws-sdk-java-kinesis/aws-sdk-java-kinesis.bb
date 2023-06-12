SUMMARY = "AWS Java SDK for Amazon Kinesis"
DESCRIPTION = "The AWS Java SDK for Amazon Kinesis module holds the \
client classes that are used for communicating with \
Amazon Kinesis Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-kinesis-1.11.3-7.8.noarch.rpm"
RPM_HASH = "f3700412cf4f639d263a96edc73a8f962a62926e9b0c3b779f6a425f656dfd31af08382ac5802161654de97d5bc0caf4150d295cb928847f78e22693559289bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-kinesis \
mvn(com.amazonaws:aws-java-sdk-kinesis) \
mvn(com.amazonaws:aws-java-sdk-kinesis:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
