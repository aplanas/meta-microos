SUMMARY = "Javadoc for logback"
DESCRIPTION = "API documentation for the Logback library"
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "logback-javadoc-1.2.11-2.1.noarch.rpm"
RPM_HASH = "e368fed3a0ef8c0738cab484d7780195d8c1adea0ec193630281f29e356eaec389d977d65ff67cce969c10b435560300d556022fc39d704eb98bc42aafd1524e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
