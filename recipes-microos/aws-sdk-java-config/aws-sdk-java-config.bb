SUMMARY = "AWS Java SDK for AWS Config"
DESCRIPTION = "The AWS Java SDK for AWS Config module holds the \
client classes that are used for communicating with \
AWS Config Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-config-1.11.3-7.8.noarch.rpm"
RPM_HASH = "7bc9f3f00cad6dbebc85476e870472384534b601dbace2f71e8867a643a56cedcee80985687f3fde495b859edfbaf3950b32e14bf27eaed100167f2e76e67011"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-config \
mvn(com.amazonaws:aws-java-sdk-config) \
mvn(com.amazonaws:aws-java-sdk-config:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
