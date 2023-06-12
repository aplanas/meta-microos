SUMMARY = "AWS Java SDK for AWS IAM"
DESCRIPTION = "The AWS Java SDK for AWS IAM module holds the \
client classes that are used for communicating with \
AWS Identity and Access Management Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-iam-1.11.3-7.8.noarch.rpm"
RPM_HASH = "b7c78162af7def7f65b4b182e731281aa2ee5b796f63b72708942daf0ffaf07317288d56a8e901bcdeedb902854e8b7d533df8f90d098c88d8be6948a1ad19ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-iam \
mvn(com.amazonaws:aws-java-sdk-iam) \
mvn(com.amazonaws:aws-java-sdk-iam:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
