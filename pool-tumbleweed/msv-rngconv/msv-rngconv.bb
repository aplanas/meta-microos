SUMMARY = "Multi-Schema Validator RNG Converter"
DESCRIPTION = "Multi-Schema Validator RNG Converter."
LICENSE = "Apache-1.1 & BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-rngconv-2013.6.1-3.11.noarch.rpm"
RPM_HASH = "532b584179e9018b62dcf7939addefc32165e19d03ff5855fc421f2cf41f05ad2c4c6b5462618f1708448a686831588a86332f953b442afe0fd2ab5cc6276fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-rngconv \
mvn-net.java.dev.msv-msv-rngconverter \
mvn-net.java.dev.msv-msv-rngconverter-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-net.java.dev.msv-msv-core \
mvn-net.java.dev.msv-xsdlib \
mvn-xerces-xercesImpl \
mvn-xml-resolver-xml-resolver"

inherit rpm
