SUMMARY = "CloudWatch Metrics for AWS Java SDK"
DESCRIPTION = "This package holds the classes for uploading the \
client side metrics collected from AWS Java SDK to \
Amazon CloudWatch."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudwatchmetrics-1.11.3-7.9.noarch.rpm"
RPM_HASH = "bb64c675da29a04e445c10742cb14ec34f2ef338de7a61b757faae9ce972febeec986d39a9f438491f4a5a7e54ae68a6c60c0c95fc6604c5379f8187fb656128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudwatchmetrics \
mvn-com.amazonaws-aws-java-sdk-cloudwatchmetrics \
mvn-com.amazonaws-aws-java-sdk-cloudwatchmetrics-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-cloudwatch \
mvn-com.amazonaws-aws-java-sdk-core \
mvn-com.amazonaws-aws-java-sdk-dynamodb"

inherit rpm
