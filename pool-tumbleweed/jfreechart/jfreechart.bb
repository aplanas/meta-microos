SUMMARY = "Java chart library"
DESCRIPTION = "JFreeChart is a free 100% Java chart library that makes it easy for \
developers to display professional quality charts in their applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.19"

RPM_NAME = "jfreechart-1.0.19-1.19.noarch.rpm"
RPM_HASH = "06d410842eec8533bbe53541ec5bafe9636cc6a2a5fca352806722a6514dc0948a21ed9538f8e40e810710b44a4f2e0147432c880ad42667d4e5c95034167a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jfreechart \
mvn-org.jfree-jfreechart \
mvn-org.jfree-jfreechart-pom- \
osgi-org.jfree.jfreechart"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jfree-jcommon"

inherit rpm
