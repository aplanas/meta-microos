SUMMARY = "AWS Java SDK for Amazon EC2"
DESCRIPTION = "The AWS Java SDK for Amazon EC2 module holds the \
client classes that are used for communicating with \
Amazon EC2 Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ec2-1.11.3-7.9.noarch.rpm"
RPM_HASH = "2996586e6d06ff6383846e5cde36beb8b74607f444851889bd8201b7ebda8a173a0dccc3dc875c9b00d8301dbc424102cffff5ed55f064782da645b45ac4d208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ec2 \
mvn-com.amazonaws-aws-java-sdk-ec2 \
mvn-com.amazonaws-aws-java-sdk-ec2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
