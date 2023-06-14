SUMMARY = "AWS Java SDK for Amazon CloudWatch"
DESCRIPTION = "The AWS Java SDK for Amazon CloudWatch module holds the \
client classes that are used for communicating with \
Amazon CloudWatch Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudwatch-1.11.3-7.8.noarch.rpm"
RPM_HASH = "e50e9277009ee88d951d52b6b5afbc254934c93dc18946e961b4f2ade99e483bdd30f5796bed53b2a58199b791b5422e2df9e787973748421e4dd4c8a3015157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudwatch \
mvn-com.amazonaws-aws-java-sdk-cloudwatch \
mvn-com.amazonaws-aws-java-sdk-cloudwatch-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
