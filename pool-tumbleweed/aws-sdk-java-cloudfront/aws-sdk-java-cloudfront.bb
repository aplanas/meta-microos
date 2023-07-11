SUMMARY = "AWS Java SDK for Amazon CloudFront"
DESCRIPTION = "The AWS Java SDK for Amazon CloudFront module holds the \
client classes that are used for communicating with \
Amazon CloudFront Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudfront-1.11.3-7.9.noarch.rpm"
RPM_HASH = "5679b9d991061701d407c0515447874490d612ffea04302289ee703320445d5e1937505855a1287e420a73b36f24936d5a8f7a3d99d4c575dab7b6072fa9e0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudfront \
mvn-com.amazonaws-aws-java-sdk-cloudfront \
mvn-com.amazonaws-aws-java-sdk-cloudfront-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
