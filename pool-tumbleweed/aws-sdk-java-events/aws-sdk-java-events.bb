SUMMARY = "AWS Java SDK for Amazon CloudWatch Events"
DESCRIPTION = "The AWS Java SDK for Amazon CloudWatch Events module \
holds the client classes that are used for communicating \
with Amazon CloudWatch Events Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-events-1.11.3-7.9.noarch.rpm"
RPM_HASH = "f5d85afbd886a66d2eaf88ed9ae5560802f3ff9b7c46bfb38cdea45926ca2367d02d94a3f725109cc3dfebe23d57280045acf5d8ad2850d643596aeba89e7038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-events \
mvn-com.amazonaws-aws-java-sdk-events \
mvn-com.amazonaws-aws-java-sdk-events-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
