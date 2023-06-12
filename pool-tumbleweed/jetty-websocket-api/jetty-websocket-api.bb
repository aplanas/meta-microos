SUMMARY = "The websocket-api module for Jetty"
DESCRIPTION = "%{extdesc} The websocket-api module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.51"

RPM_NAME = "jetty-websocket-api-9.4.51-1.1.noarch.rpm"
RPM_HASH = "2b3ee7aef57dfd5680bf98c323d6a3a49e7175ca45da73bd61a737fc4b4c234741af4e8ffd05b44e437c6285666ab3ee64a5282d09a9a04b07401cab75c4a7c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-api \
mvn(org.eclipse.jetty.websocket:websocket-api) \
mvn(org.eclipse.jetty.websocket:websocket-api:pom:) \
osgi(org.eclipse.jetty.websocket.api)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
