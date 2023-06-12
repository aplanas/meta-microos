SUMMARY = "Javadoc for glassfish-websocket-api"
DESCRIPTION = "This package contains javadoc for glassfish-websocket-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.1"

RPM_NAME = "glassfish-websocket-api-javadoc-1.1-2.10.noarch.rpm"
RPM_HASH = "94b3c9eaec07bb4f9062924ee962f471ab69e67f5078990cdf7da97d511b7c75ec299da84d821fec3ee8a69e51eb30011aef1ccb0a66dcb0b1a70d2568be2a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-websocket-api-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
