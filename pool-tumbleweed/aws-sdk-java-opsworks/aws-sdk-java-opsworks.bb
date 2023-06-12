SUMMARY = "AWS Java SDK for AWS OpsWorks"
DESCRIPTION = "The AWS Java SDK for AWS OpsWorks module holds the \
client classes that are used for communicating with \
AWS OpsWorks Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-opsworks-1.11.3-7.8.noarch.rpm"
RPM_HASH = "010534d13cb2f6960178c16601fbe20b2b49505e499a8af30401ae3268c6dfafd30399aac71d4cb963e3a879d9f22f48286d21813f0d854ab34de2694b3e8da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-opsworks \
mvn(com.amazonaws:aws-java-sdk-opsworks) \
mvn(com.amazonaws:aws-java-sdk-opsworks:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
