SUMMARY = "AWS Java SDK for Amazon Route53"
DESCRIPTION = "The AWS Java SDK for Amazon Route53 module holds the \
client classes that are used for communicating with \
Amazon Route53 Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-route53-1.11.3-7.8.noarch.rpm"
RPM_HASH = "8aa24e5121f16a1791d51241eb2e247e5b8b08a60f879ce4e106dfb34d0f1173c55f9c07187506ef881cbf045751dc6beca0db3ccf307415ed798b7555a02ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-route53 mvn(com.amazonaws:aws-java-sdk-route53) mvn(com.amazonaws:aws-java-sdk-route53:pom:)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(com.amazonaws:aws-java-sdk-core)"

inherit rpm
