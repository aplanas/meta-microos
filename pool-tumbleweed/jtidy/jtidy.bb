SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "jtidy-1.0.4-1.1.noarch.rpm"
RPM_HASH = "7dfe19a8e5812acb42841c8e408cbab14774aa4770c978bf54d30b6f8f0b344eb32801a8f1f3ca49f64660cb609b73fb87f90fe801620adcefb5be5c4c71ac77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-jtidy \
jtidy \
mvn-com.github.jtidy-jtidy \
mvn-com.github.jtidy-jtidy-pom- \
mvn-net.sf.jtidy-jtidy \
mvn-net.sf.jtidy-jtidy-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
xerces-j2 \
xml-commons-apis"

inherit rpm
