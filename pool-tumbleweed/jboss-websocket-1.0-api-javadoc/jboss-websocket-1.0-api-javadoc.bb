SUMMARY = "Javadocs for jboss-websocket-1.0-api"
DESCRIPTION = "This package contains the API documentation for jboss-websocket-1.0-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-websocket-1.0-api-javadoc-1.0.0-2.10.noarch.rpm"
RPM_HASH = "f37798a0b2591e23cebf4c873210f98cb205d7151f613cd8fe6ec64e57e7faac3206728a3c2d361a38e394d8fd8c0658812d181f029d30a6cc02a856faeae268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-websocket-1.0-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
