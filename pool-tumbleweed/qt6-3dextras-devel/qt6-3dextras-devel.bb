SUMMARY = "Development files for the Qt 6 3DExtras library"
DESCRIPTION = "Development files for the Qt 6 3DExtras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dextras-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "636e5d2c5ef660c599c4bb9996baa9cb28a5660aceb5e975fb6dfb05503337728a8f2852b82f219a0236ba1d79955e4262924b71eb3f08c21ac2bf35ca57097a"

RPROVIDES:${PN} += "cmake-Qt63DExtras \
pkgconfig-Qt63DExtras \
qt6-3dextras-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DInput \
cmake-Qt63DLogic \
cmake-Qt63DRender \
cmake-Qt6Gui \
libQt63DExtras6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DInput \
pkgconfig-Qt63DLogic \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
