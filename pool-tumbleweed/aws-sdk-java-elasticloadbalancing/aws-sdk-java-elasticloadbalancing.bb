SUMMARY = "AWS Java SDK for Elastic Load Balancing"
DESCRIPTION = "The AWS Java SDK for Elastic Load Balancing module holds the \
client classes that are used for communicating with \
Elastic Load Balancing Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticloadbalancing-1.11.3-7.8.noarch.rpm"
RPM_HASH = "87a313c8b67571a7ff5acf0fde9104aae6e639de4d7e7aeac35145b0da2049b619cd9e26d9b11f8eb2c1737d372fe3bf680063dfbb6c4b5d99f3a4edab4eaec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticloadbalancing \
mvn-com.amazonaws-aws-java-sdk-elasticloadbalancing \
mvn-com.amazonaws-aws-java-sdk-elasticloadbalancing-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
