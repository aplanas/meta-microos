SUMMARY = "The websocket-api module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-api module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-api-9.4.51-1.2.noarch.rpm"
RPM_HASH = "fbbcd79671bc9f9c0a340a0ff565368fef005a0d87e461578bd2577639314e57b48ebede0b45cddbe15a6c5921808918f21d2cae4a834f97691ea6f077b221ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-api \
mvn-org.eclipse.jetty.websocket-websocket-api \
mvn-org.eclipse.jetty.websocket-websocket-api-pom- \
osgi-org.eclipse.jetty.websocket.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
