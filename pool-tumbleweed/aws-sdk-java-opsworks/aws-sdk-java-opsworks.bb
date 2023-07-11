SUMMARY = "AWS Java SDK for AWS OpsWorks"
DESCRIPTION = "The AWS Java SDK for AWS OpsWorks module holds the \
client classes that are used for communicating with \
AWS OpsWorks Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-opsworks-1.11.3-7.9.noarch.rpm"
RPM_HASH = "4aa986783ede142aedbe3f0a3b5bb028357d3686054f8689bc9f7798cea7d7a9ee8ae12307dfd9f250276757a4e23aca39d72e3ef2b5c9da5a3d86847dd10595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-opsworks \
mvn-com.amazonaws-aws-java-sdk-opsworks \
mvn-com.amazonaws-aws-java-sdk-opsworks-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
