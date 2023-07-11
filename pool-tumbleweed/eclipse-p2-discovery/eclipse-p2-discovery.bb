SUMMARY = "Eclipse p2 Discovery"
DESCRIPTION = " \
The p2 Discovery mechanism provides a simplified and branded front-end for the \
p2 provisioning platform. Discovery can be used as a tool to display and \
install from existing P2 repositories or as a framework to build branded \
installer UIs."
LICENSE = "EPL-2.0"

PV = "4.15"

RPM_NAME = "eclipse-p2-discovery-4.15-9.4.noarch.rpm"
RPM_HASH = "d4bd2133e49dad151c9d1b290dad54691e66c280e346f1a8c074a4d16e316693bfadd6cb652fe79c80f8212b453867798af9b9c60ed55315add6631a1327f554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-p2-discovery \
mvn-org.eclipse.equinox-org.eclipse.equinox.p2.discovery \
mvn-org.eclipse.equinox-org.eclipse.equinox.p2.discovery.compatibility \
mvn-org.eclipse.equinox-org.eclipse.equinox.p2.discovery.feature \
mvn-org.eclipse.equinox-org.eclipse.equinox.p2.ui.discovery \
osgi-org.eclipse.equinox.p2.discovery \
osgi-org.eclipse.equinox.p2.discovery.compatibility \
osgi-org.eclipse.equinox.p2.discovery.feature \
osgi-org.eclipse.equinox.p2.ui.discovery"

RDEPENDS:${PN} += "eclipse-platform \
java-headless \
javapackages-filesystem"

inherit rpm
