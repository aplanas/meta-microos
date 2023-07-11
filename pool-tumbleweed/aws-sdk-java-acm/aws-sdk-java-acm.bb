SUMMARY = "AWS Java SDK for AWS Certificate Manager"
DESCRIPTION = "The AWS Java SDK for AWS Certificate Manager module \
holds the client classes that are used for communicating \
with AWS Certificate Manager service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-acm-1.11.3-7.9.noarch.rpm"
RPM_HASH = "1af1becee85c375eccf3a33eaf38fbea12b55493ee860950bdfc5cc84098ac6ded53037db5129a0bfc855065c6622bbf501a6a4bd156b9431c2b347812307621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-acm \
mvn-com.amazonaws-aws-java-sdk-acm \
mvn-com.amazonaws-aws-java-sdk-acm-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
