SUMMARY = "AnyEdit plugin for eclipse"
DESCRIPTION = "The AnyEdit plugin adds several new actions to the context menu of text-based \
Eclipse editors."
LICENSE = "EPL-1.0"

PV = "2.7.1"

RPM_NAME = "eclipse-anyedit-2.7.1-2.7.noarch.rpm"
RPM_HASH = "51561f6955096ea4fcc083ba8dd205156477746273a8ea9fd54312f03d4509e6489d657d72cf23cf0234ec3d9eedcc1ec335acbf0e7c030a45539153ef0d5d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-anyedit \
mvn-de.loskutov-AnyEditTools \
mvn-de.loskutov-de.loskutov.anyedit.AnyEditTools \
osgi-AnyEditTools \
osgi-de.loskutov.anyedit.AnyEditTools"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
osgi-org.eclipse.jdt.annotation \
osgi-org.eclipse.jdt.core \
osgi-org.eclipse.jdt.launching \
osgi-org.eclipse.jdt.ui \
osgi-org.junit"

inherit rpm
