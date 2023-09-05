SUMMARY = "Contrib for jna"
DESCRIPTION = "This package contains the contributed examples for jna."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "jna-contrib-5.13.0-1.1.noarch.rpm"
RPM_HASH = "12536e7c50eaa4e2c0d60a6b114b1ea1bb659b95c554e8a55d20ff365e5c7fa5c99a278cf59c7c6468852ab29065b84a19f2661e5976cd470f1d86e87529d49e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jna-contrib \
jna-platform \
mvn-net.java.dev.jna-jna-platform \
mvn-net.java.dev.jna-jna-platform-jpms \
mvn-net.java.dev.jna-jna-platform-jpms-pom- \
mvn-net.java.dev.jna-jna-platform-pom- \
mvn-net.java.dev.jna-platform \
mvn-net.java.dev.jna-platform-pom- \
osgi-com.sun.jna.platform"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jna \
mvn-net.java.dev.jna-jna \
osgi-com.sun.jna"

inherit rpm
