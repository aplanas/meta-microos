SUMMARY = "Multi-Schema Validator XML Schema Library"
DESCRIPTION = "Multi-Schema Validator XML Schema Library."
LICENSE = "Apache-1.1 & BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-xsdlib-2013.6.1-3.10.noarch.rpm"
RPM_HASH = "0a77c41473bc70042362e727573413b2345f5952fe41e4c3d44623c245e57746b2c9076c39a16d5a8abab9d88e9c78fcf0eb24a023392ba3515292eb6951d107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-xsdlib \
mvn(com.sun.msv.datatype.xsd:xsdlib) \
mvn(com.sun.msv.datatype.xsd:xsdlib:pom:) \
mvn(net.java.dev.msv:xsdlib) \
mvn(net.java.dev.msv:xsdlib:pom:) \
osgi(net.java.dev.msv.xsdlib)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(relaxngDatatype:relaxngDatatype) \
mvn(xml-resolver:xml-resolver)"

inherit rpm
