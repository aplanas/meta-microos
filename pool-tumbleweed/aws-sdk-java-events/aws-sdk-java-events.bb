SUMMARY = "AWS Java SDK for Amazon CloudWatch Events"
DESCRIPTION = "The AWS Java SDK for Amazon CloudWatch Events module \
holds the client classes that are used for communicating \
with Amazon CloudWatch Events Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-events-1.11.3-7.8.noarch.rpm"
RPM_HASH = "ddf9e849827ecec574f14636155b36f9efb37540e3c88ca4784be8247a7e5253b8ecab57547fd9d42fff33500f93ff678432d456ae7cf4edd9b1ad527fa16a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-events \
mvn(com.amazonaws:aws-java-sdk-events) \
mvn(com.amazonaws:aws-java-sdk-events:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
