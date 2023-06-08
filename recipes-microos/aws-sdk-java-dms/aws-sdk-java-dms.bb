SUMMARY = "AWS Java SDK for AWS Database Migration Service"
DESCRIPTION = "The AWS Java SDK for AWS Database Migration Service module \
holds the client classes that are used for communicating \
with AWS Database Migration Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-dms-1.11.3-7.8.noarch.rpm"
RPM_HASH = "01007fa35a3dc8ab92567d0a8af5adac79aa561cdba99a954953b71c53d0a59fb1d20d9a01ccc0e86f3feb11b26f4378a31eb539c466058c43f9c234f9cc7349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-dms mvn(com.amazonaws:aws-java-sdk-dms) mvn(com.amazonaws:aws-java-sdk-dms:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
