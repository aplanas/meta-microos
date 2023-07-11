SUMMARY = "Multi-Schema Validator XML Schema Library"
DESCRIPTION = "Multi-Schema Validator XML Schema Library."
LICENSE = "Apache-1.1 & BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-xsdlib-2013.6.1-3.11.noarch.rpm"
RPM_HASH = "bea841569e7e6e9318c75e212be6ee08290bf9f0518f639d28f3333bd6e1d0124df9df1ee4cac1c8c4dd7b5e538defe6dc253361ab35f5b271f0032f0618b248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-xsdlib \
mvn-com.sun.msv.datatype.xsd-xsdlib \
mvn-com.sun.msv.datatype.xsd-xsdlib-pom- \
mvn-net.java.dev.msv-xsdlib \
mvn-net.java.dev.msv-xsdlib-pom- \
osgi-net.java.dev.msv.xsdlib"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-relaxngDatatype-relaxngDatatype \
mvn-xml-resolver-xml-resolver"

inherit rpm
