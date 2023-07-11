SUMMARY = "AWS Java SDK for Amazon Elastic File System"
DESCRIPTION = "The AWS Java SDK for Amazon Elastic File System module \
holds the client classes that are used for communicating \
with Amazon Elastic File System."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-efs-1.11.3-7.9.noarch.rpm"
RPM_HASH = "9565e2940205d68f9f3f75b5f26501933f83fb47a12973c5b3d21356ac44f912d7444026100d04b77be5e603d67866d129f944964cb6200916071633dd92f244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-efs \
mvn-com.amazonaws-aws-java-sdk-efs \
mvn-com.amazonaws-aws-java-sdk-efs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
