SUMMARY = "Eclipse p2 Discovery"
DESCRIPTION = " \
The p2 Discovery mechanism provides a simplified and branded front-end for the \
p2 provisioning platform. Discovery can be used as a tool to display and \
install from existing P2 repositories or as a framework to build branded \
installer UIs."
LICENSE = "EPL-2.0"

PV = "4.15"

RPM_NAME = "eclipse-p2-discovery-4.15-9.3.noarch.rpm"
RPM_HASH = "a327e3db875c907ff226f4cf6675cbbac5762307ab8b5576582a0d8d2ec000899fc179510790481659965f070d71153c0a701de55b9383638c1d1d696013e2e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-p2-discovery mvn(org.eclipse.equinox:org.eclipse.equinox.p2.discovery) mvn(org.eclipse.equinox:org.eclipse.equinox.p2.discovery.compatibility) mvn(org.eclipse.equinox:org.eclipse.equinox.p2.discovery.feature) mvn(org.eclipse.equinox:org.eclipse.equinox.p2.ui.discovery) osgi(org.eclipse.equinox.p2.discovery) osgi(org.eclipse.equinox.p2.discovery.compatibility) osgi(org.eclipse.equinox.p2.discovery.feature) osgi(org.eclipse.equinox.p2.ui.discovery)"
RDEPENDS:${PN} += "eclipse-platform java-headless javapackages-filesystem"

inherit rpm
