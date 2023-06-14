SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "BSD-3-Clause"

PV = "8.0"

RPM_NAME = "jtidy-8.0-30.6.noarch.rpm"
RPM_HASH = "bcabe813442f04e6a8130e627845cd3a9d853eb818feca89a2d0e6fce6fc5860edd901008b935026045374a8bf37b6dd0b62222bf69045208e91a4e4fe532569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-jtidy \
jtidy \
mvn-jtidy-jtidy \
mvn-jtidy-jtidy-pom- \
mvn-net.sf.jtidy-jtidy \
mvn-net.sf.jtidy-jtidy-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-xerces-dom3-xml-apis \
xerces-j2 \
xml-commons-apis"

inherit rpm
