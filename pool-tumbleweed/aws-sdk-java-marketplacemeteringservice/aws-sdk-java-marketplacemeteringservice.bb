SUMMARY = "AWS Java SDK for AWS Marketplace Metering Service"
DESCRIPTION = "The AWS Java SDK for AWS Marketplace Metering Service module \
holds the client classes that are used for communicating with \
AWS Marketplace Metering Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-marketplacemeteringservice-1.11.3-7.9.noarch.rpm"
RPM_HASH = "01e902abcdcd968d4a61cadf6e25b5c3a6df70abb3c11276e273a58c8b3d6d6d0b560dbffff230415ff560614053e82235e2d9ae1ff3a72a048825042e252d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-marketplacemeteringservice \
mvn-com.amazonaws-aws-java-sdk-marketplacemeteringservice \
mvn-com.amazonaws-aws-java-sdk-marketplacemeteringservice-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
