SUMMARY = "Javadoc for glassfish-websocket-api"
DESCRIPTION = "This package contains javadoc for glassfish-websocket-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.1"

RPM_NAME = "glassfish-websocket-api-javadoc-1.1-2.11.noarch.rpm"
RPM_HASH = "24660054e8a7d73f39092ffd7cc43d7603fbfe4f692ab43c6bc3c173f597eb5e2560efe458513d8a6b797f3b8b0a33fa66f0d03e55ed62d282c316907491a322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-websocket-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
