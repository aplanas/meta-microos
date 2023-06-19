SUMMARY = "Java Web Start and plugin implementation (API documentation)"
DESCRIPTION = "The IcedTea-Web project provides a Free Software web browser plugin running \
applets written in the Java programming language and an implementation of Java \
Web Start, originally based on the NetX project. \
This package contains API documentation for the icedtea-web Java Web Start \
and plugin implementation."
LICENSE = "GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.8.8"

RPM_NAME = "icedtea-web-javadoc-1.8.8-1.10.noarch.rpm"
RPM_HASH = "4faf20c7c9ee37ce0dd1374ff2f4a65acd5b5a34830889a8846f31029bb240a06fb07000fbbdc64467da4b26f1d18e8e9639fd620246da89eab30d3921bc23cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icedtea-web-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
