SUMMARY = "Development tools for deepin dock"
DESCRIPTION = "The deepin-dock-devel package contains the header files for deepin-dock."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.65"

RPM_NAME = "deepin-dock-devel-5.5.65-1.4.aarch64.rpm"
RPM_HASH = "8eb85684bf74d86ed7e76506af3e0c060548dd1014d38a6136f84a98757c4b87cab65963d6cffd0c06a6f1706b6912eba09f773f25c69daa1276ccfdee216f12"

RPROVIDES:${PN} += "cmake-DdeDock \
deepin-dock-devel \
pkgconfig-dde-dock"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
