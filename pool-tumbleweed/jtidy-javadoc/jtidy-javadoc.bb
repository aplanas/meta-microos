SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "BSD-3-Clause"

PV = "8.0"

RPM_NAME = "jtidy-javadoc-8.0-30.7.noarch.rpm"
RPM_HASH = "7ea3f0a121aad8c8fe4de6114c2936fb7cf4bfb0e5e48741f5f6688dde0315f42d2b656f863a68861bb6947b52b789d62e1b96279f055f345cd57d33280679c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jtidy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
