SUMMARY = "AWS Java SDK for Amazon CloudWatch Logs"
DESCRIPTION = "The AWS Java SDK for Amazon CloudWatch Logs module \
holds the client classes that are used for communicating \
with Amazon CloudWatch Logs Service."
LICENSE = "Apache-2.0 & SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-logs-1.11.3-7.9.noarch.rpm"
RPM_HASH = "ea415380f690390026c8f1487ad7ac986f456df3bb6ee842abaec24eedad701999ec0bc0c2ac5cf201945533010acab7322ed6d27e023f88bdcd2318ba84995c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-logs \
mvn-com.amazonaws-aws-java-sdk-logs \
mvn-com.amazonaws-aws-java-sdk-logs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
