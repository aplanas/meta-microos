SUMMARY = "Java Web Start and plugin implementation (API documentation)"
DESCRIPTION = "The IcedTea-Web project provides a Free Software web browser plugin running \
applets written in the Java programming language and an implementation of Java \
Web Start, originally based on the NetX project. \
This package contains API documentation for the icedtea-web Java Web Start \
and plugin implementation."
LICENSE = "GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.8.8"

RPM_NAME = "icedtea-web-javadoc-1.8.8-1.11.noarch.rpm"
RPM_HASH = "bb5609613c666567ed5811a21cfe043ad054d28a2e01d67af33b0ea46326aeade0a7a83d79c3e62dffa202797190389139aa139195fc4995d054f96c4581c38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icedtea-web-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
