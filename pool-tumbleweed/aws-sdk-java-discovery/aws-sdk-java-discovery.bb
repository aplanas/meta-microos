SUMMARY = "AWS Java SDK for AWS Application Discovery Service"
DESCRIPTION = "The AWS Java SDK for AWS Application Discovery Service module \
holds the client classes that are used for communicating with \
AWS Application Discovery Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-discovery-1.11.3-7.8.noarch.rpm"
RPM_HASH = "bf0e413c684418a666588d9e1dca0761f65ba667194bd66c75a608461ff764675f2a1aa6cd6d4eee359ef799a3e4bb634982e0982b3ce500196cadba4dad8e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-discovery \
mvn(com.amazonaws:aws-java-sdk-discovery) \
mvn(com.amazonaws:aws-java-sdk-discovery:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
