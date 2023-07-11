SUMMARY = "Multi-Schema Validator Generator"
DESCRIPTION = "Multi-Schema Validator Generator."
LICENSE = "Apache-1.1 & BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-xmlgen-2013.6.1-3.11.noarch.rpm"
RPM_HASH = "0e9ab97c02a4002d1b8eee1c42ba014ada08150318b368629bfc198ffab328220939af3c3e707ab17a38f5918a3d1413ac7c5c76d8cc830e6191a8b87b0e333a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-xmlgen \
mvn-net.java.dev.msv-msv-generator \
mvn-net.java.dev.msv-msv-generator-pom- \
osgi-net.java.dev.msv.generator"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-net.java.dev.msv-msv-core \
mvn-net.java.dev.msv-xsdlib \
mvn-xerces-xercesImpl \
mvn-xml-resolver-xml-resolver"

inherit rpm
