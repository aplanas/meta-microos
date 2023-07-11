SUMMARY = "AWS Java SDK for AWS Import/Export"
DESCRIPTION = "The AWS Java SDK for AWS Import/Export module \
holds the client classes that are used \
for communicating with AWS Import/Export Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-importexport-1.11.3-7.9.noarch.rpm"
RPM_HASH = "ced7d140db88c5c64e8a659794d128708263a6c66b40b8829e7e7df5f98e1b6a452ac8e2fd2062f3a2546a0162a26b0c584894ffb3640de54d8b11c4c8a2f036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-importexport \
mvn-com.amazonaws-aws-java-sdk-importexport \
mvn-com.amazonaws-aws-java-sdk-importexport-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
