SUMMARY = "Development files for the Qt 6 3DExtras library"
DESCRIPTION = "Development files for the Qt 6 3DExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dextras-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "ae29e8a0d4b362085f3c95f983036b1ba48890a20e9c1174eabda198f393d956298f134e86a7a2e8c14736f0d903fa168283b9b5ec1903399d88d144226e0b8d"

RPROVIDES:${PN} += "cmake(Qt63DExtras) \
pkgconfig(Qt63DExtras) \
qt6-3dextras-devel \
qt6-3dextras-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt63DCore) \
cmake(Qt63DInput) \
cmake(Qt63DLogic) \
cmake(Qt63DRender) \
libQt63DExtras6 \
pkgconfig(Qt63DCore) \
pkgconfig(Qt63DInput) \
pkgconfig(Qt63DLogic) \
pkgconfig(Qt63DRender) \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui)"

inherit rpm
