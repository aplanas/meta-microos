SUMMARY = "Javadoc for glassfish-websocket-api"
DESCRIPTION = "This package contains javadoc for glassfish-websocket-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.1"

RPM_NAME = "glassfish-websocket-api-javadoc-1.1-3.1.noarch.rpm"
RPM_HASH = "a83cfa31905d28f6406d6b036e21f2457fd2ab39e73233eb305cd49d4dbc5a5b1f7fbbe79283c985f4888b67af2578e055a2fc943d1056a6f358252838e70b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-websocket-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
