SUMMARY = "AWS Java SDK for AWS CloudTrail"
DESCRIPTION = "The AWS Java SDK for AWS CloudTrail module holds the \
client classes that are used for communicating with \
AWS CloudTrail Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudtrail-1.11.3-7.8.noarch.rpm"
RPM_HASH = "0ee7f85a177b974b04f2a8fa8e9fd67137c5fca7464d69f314f679f0f7f5b38db9d75e97ce2193cc914a4e16ee57163f056732b45a85b3a9f062d0d8f13e19e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudtrail \
mvn-com.amazonaws-aws-java-sdk-cloudtrail \
mvn-com.amazonaws-aws-java-sdk-cloudtrail-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
