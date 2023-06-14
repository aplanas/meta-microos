SUMMARY = "AWS Java SDK for AWS Certificate Manager"
DESCRIPTION = "The AWS Java SDK for AWS Certificate Manager module \
holds the client classes that are used for communicating \
with AWS Certificate Manager service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-acm-1.11.3-7.8.noarch.rpm"
RPM_HASH = "db3884183fb2b7bd33a6eeeb03a1ef28b040124c0c9a2dd787648d56872150c6cb33760eaeb3aa841fff9b1968f0e5de445421e239238356ef3a386298d3bd38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-acm \
mvn-com.amazonaws-aws-java-sdk-acm \
mvn-com.amazonaws-aws-java-sdk-acm-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
