SUMMARY = "Contrib for jna"
DESCRIPTION = "This package contains the contributed examples for jna."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.5.0"

RPM_NAME = "jna-contrib-5.5.0-3.7.noarch.rpm"
RPM_HASH = "58c33ee3c2e8c89a98ed2d5226ece6ddf23ba949bda73f697031d6b042416000bb4fa0f492546e9bb65b8f327319abe4886f24031c8fee3fa6cb1d39c86fda7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jna-contrib \
mvn-net.java.dev.jna-jna-platform \
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
