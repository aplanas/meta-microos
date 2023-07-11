SUMMARY = "AnyEdit plugin for eclipse"
DESCRIPTION = "The AnyEdit plugin adds several new actions to the context menu of text-based \
Eclipse editors."
LICENSE = "EPL-1.0"

PV = "2.7.1"

RPM_NAME = "eclipse-anyedit-2.7.1-2.8.noarch.rpm"
RPM_HASH = "93d797005311b4f37823b0951cc851ce6374e834367ea932281d10bcb9d9707884428bf8382c4765f8254b204da0afda756a3f9d06a0edf96aa3fbd6b9ad67b3"
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
