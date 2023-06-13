SUMMARY = "AWS Java SDK for AWS Direct Connect"
DESCRIPTION = "The AWS Java SDK for AWS Direct Connect module holds the \
client classes that are used for communicating with \
AWS Direct Connect Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-directconnect-1.11.3-7.8.noarch.rpm"
RPM_HASH = "f7e2d638bee21c8914dfc62ab7f5c9156d4586e827548ca4679587dd197fb960c679055ff643f18904b84eb8ec315c520e89ebb9a5bc4b69c74709e3e4f77af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-directconnect \
mvn(com.amazonaws:aws-java-sdk-directconnect) \
mvn(com.amazonaws:aws-java-sdk-directconnect:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
