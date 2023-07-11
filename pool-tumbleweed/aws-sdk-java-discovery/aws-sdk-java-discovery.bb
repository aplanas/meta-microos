SUMMARY = "AWS Java SDK for AWS Application Discovery Service"
DESCRIPTION = "The AWS Java SDK for AWS Application Discovery Service module \
holds the client classes that are used for communicating with \
AWS Application Discovery Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-discovery-1.11.3-7.9.noarch.rpm"
RPM_HASH = "c15ceffc29fc815b5f59e2c64d2c2d3e7d348550f4870ffddb27a48b50fde93cc85d989e30af21efa1b2e3455fe81856cf9ae6fc0f2db4bfd73e10445135cecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-discovery \
mvn-com.amazonaws-aws-java-sdk-discovery \
mvn-com.amazonaws-aws-java-sdk-discovery-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
