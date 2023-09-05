SUMMARY = "An XPath engine written in Java"
DESCRIPTION = "Jaxen is an open source XPath library written in Java. It is adaptable \
to many different object models, including DOM, XOM, dom4j, and JDOM. \
Is it also possible to write adapters that treat non-XML trees such as compiled \
Java byte code or Java beans as XML, thus enabling you to query these trees \
with XPath too."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "jaxen-1.2.0-1.1.noarch.rpm"
RPM_HASH = "c9bdde95647b9bc866fcefe635f66dce6a7d11d3526e3c58b48487f3ced6fcd9d5033661ce0140a4a3fa937d2c01c7c2d8f14c2148504c4f4dc09f74982a6b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxen \
mvn-jaxen-jaxen \
mvn-jaxen-jaxen-pom- \
osgi-jaxen"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
