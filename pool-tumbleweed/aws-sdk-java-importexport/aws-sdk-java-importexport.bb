SUMMARY = "AWS Java SDK for AWS Import/Export"
DESCRIPTION = "The AWS Java SDK for AWS Import/Export module \
holds the client classes that are used \
for communicating with AWS Import/Export Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-importexport-1.11.3-7.8.noarch.rpm"
RPM_HASH = "c30eb6e61ee7882e5f54b4ba04ecb5d6cceb671dc5af41ccab230bdd4b869fc3a6837c00d5824cde82316b4dd59cecafc140da140e8514cab1f6fcc445c3cae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-importexport \
mvn(com.amazonaws:aws-java-sdk-importexport) \
mvn(com.amazonaws:aws-java-sdk-importexport:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
