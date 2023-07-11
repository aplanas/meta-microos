SUMMARY = "Multi-Schema Validator Core"
DESCRIPTION = "Multi-Schema Validator Core."
LICENSE = "Apache-1.1 & BSD-3-Clause & Apache-2.0 & SUSE-Public-Domain"

PV = "2013.6.1"

RPM_NAME = "msv-msv-2013.6.1-3.11.noarch.rpm"
RPM_HASH = "aab36b4d0bf2049f52896256b4dab08e73809f54a55b7634723d95f9a4442850bdef1b8cc3c8d0329ea5fff36815c755bcb823d30b4a4fb750be7485525daa6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-msv \
mvn-net.java.dev.msv-msv-core \
mvn-net.java.dev.msv-msv-core-pom- \
osgi-net.java.dev.msv.core"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-isorelax-isorelax \
mvn-net.java.dev.msv-xsdlib \
mvn-xml-resolver-xml-resolver"

inherit rpm
