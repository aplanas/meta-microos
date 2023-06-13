SUMMARY = "AWS Java SDK for Amazon CloudFront"
DESCRIPTION = "The AWS Java SDK for Amazon CloudFront module holds the \
client classes that are used for communicating with \
Amazon CloudFront Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudfront-1.11.3-7.8.noarch.rpm"
RPM_HASH = "6e7d36257d2fa17d3a22abb26a4d653ce0bca0013768ad865cd4796c650b1aab646a9f3620b4c601104ccdfdce6dc5c84e1ce44d271826e0756b71501287903d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudfront \
mvn(com.amazonaws:aws-java-sdk-cloudfront) \
mvn(com.amazonaws:aws-java-sdk-cloudfront:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
