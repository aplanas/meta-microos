SUMMARY = "AWS Java SDK for AWS KMS"
DESCRIPTION = "The AWS Java SDK for AWS KMS module holds the \
client classes that are used for communicating with \
AWS Key Management Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-kms-1.11.3-7.9.noarch.rpm"
RPM_HASH = "d8e6c55d7cf655a3e4c31620edbc4709ed12ac9a35d3a4e27b5b94440140d98f362394a6c6a1848c2e66413da9862e81b16b794577d98dbda5d810f337b656ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-kms \
mvn-com.amazonaws-aws-java-sdk-kms \
mvn-com.amazonaws-aws-java-sdk-kms-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
