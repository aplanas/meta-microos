SUMMARY = "Javadocs for jboss-websocket-1.0-api"
DESCRIPTION = "This package contains the API documentation for jboss-websocket-1.0-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-websocket-1.0-api-javadoc-1.0.0-3.1.noarch.rpm"
RPM_HASH = "d479f5e318d2b583bdc9578159659cf7a8b4d7dcb2621e35db5c7e0bb866766639d9a22b44d6feef3ef4e99f879a6d41100c18cdfba4616e6abb849943c5e36d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-websocket-1.0-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
