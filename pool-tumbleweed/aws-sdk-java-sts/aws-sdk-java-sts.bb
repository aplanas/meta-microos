SUMMARY = "AWS Java SDK for AWS STS"
DESCRIPTION = "The AWS Java SDK for AWS STS module holds the \
client classes that are used for communicating with \
AWS Security Token Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-sts-1.11.3-7.9.noarch.rpm"
RPM_HASH = "758a5e5a1187d5a0a818978cc80ee4c80a9932329cfc8d211afa93f596f68d90e6d29aa856091be5c516fc4a7ff9475bf598d781e7272119120c3af81486b484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-sts \
mvn-com.amazonaws-aws-java-sdk-sts \
mvn-com.amazonaws-aws-java-sdk-sts-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
