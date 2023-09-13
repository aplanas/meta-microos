SUMMARY = "Java chart library"
DESCRIPTION = "JFreeChart is a free 100% Java chart library that makes it easy for \
developers to display professional quality charts in their applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.19"

RPM_NAME = "jfreechart-1.0.19-2.1.noarch.rpm"
RPM_HASH = "fca8879ef4b7a1593711a494ace4efeb4a901359649b2ffe092e88b96d666fe1037af5b0c8a9bd366fab96a5b7adb779bb812f8304071728af0d3149669be79d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jfreechart \
mvn-org.jfree-jfreechart \
mvn-org.jfree-jfreechart-pom- \
osgi-org.jfree.jfreechart"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jfree-jcommon"

inherit rpm
