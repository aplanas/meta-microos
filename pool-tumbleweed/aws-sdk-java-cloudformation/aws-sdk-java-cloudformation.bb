SUMMARY = "AWS Java SDK for AWS CloudFormation"
DESCRIPTION = "The AWS Java SDK for AWS CloudFormation module holds the \
client classes that are used for communicating with \
AWS CloudFormation Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudformation-1.11.3-7.8.noarch.rpm"
RPM_HASH = "f6655a9257fd4f3feb208f289e57a4b8226dd336c94508dc50532de735b31ed4096cde74bf13cf0568351055b6c0538189bbb9bd57f6d1a4c47bc3cafffcc772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudformation \
mvn(com.amazonaws:aws-java-sdk-cloudformation) \
mvn(com.amazonaws:aws-java-sdk-cloudformation:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
