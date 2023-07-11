SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "BSD-3-Clause"

PV = "8.0"

RPM_NAME = "jtidy-8.0-30.7.noarch.rpm"
RPM_HASH = "0d8ef298d876427d7ad0c5660200fedf3cac944516e0947ada3a05a848b6f1e9391d929e318adc53a509f8f2aedf6ad17b1d7906f5dec22eea759cbca945a9d7"
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
