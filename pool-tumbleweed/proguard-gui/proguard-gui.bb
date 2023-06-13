SUMMARY = "GUI for proguard"
DESCRIPTION = "A GUI for proguard."
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "proguard-gui-6.2.0-1.19.noarch.rpm"
RPM_HASH = "844cab5d2223a006d466a20398ff2d22e9afcf1531f1c50fe1303bf1f5a792b41f1b58e8f8fc66e03145503c10b878340169f892153b7bac4b5322c5579856ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(net.sf.proguard:proguard-gui) \
mvn(net.sf.proguard:proguard-gui:pom:) \
proguard-gui"

RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn(net.sf.proguard:proguard-base) \
mvn(net.sf.proguard:proguard-retrace)"

inherit rpm
