SUMMARY = "Metapackage, requires all core Packages"
DESCRIPTION = "Metapackage, Requires: all core Packages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-core-packages-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "d22efc404596a5d5fbf25835e4c41885fc8cd08644f74c36a582d5d4138193797a446127a42f6ac31c0c500124eea09b8dc6b720fd87b845e37180de18eea988"

RPROVIDES:${PN} += "R-core-packages"

RDEPENDS:${PN} += "R-compiler \
R-datasets \
R-grDevices \
R-graphics \
R-grid \
R-methods \
R-parallel \
R-splines \
R-stats \
R-stats4 \
R-tcltk \
R-tools \
R-utils"

inherit rpm
