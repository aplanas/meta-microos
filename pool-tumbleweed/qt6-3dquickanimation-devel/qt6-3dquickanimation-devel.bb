SUMMARY = "Development files for the Qt 6 3DQuickAnimation library"
DESCRIPTION = "Development files for the Qt 6 3DQuickAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquickanimation-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3ea13aeb64211ee6496446176d0f330f85153eb08773b1de6202aa985c7ffb1a0804c33069ce9067c4400aa79f5daff9fbb3fe7364d7dfcb318c39e819fbf5bd"

RPROVIDES:${PN} += "cmake-Qt63DQuickAnimation \
pkgconfig-Qt63DQuickAnimation \
qt6-3dquickanimation-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DAnimation \
cmake-Qt63DCore \
cmake-Qt63DQuick \
cmake-Qt63DRender \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickAnimation6 \
pkgconfig-Qt63DAnimation \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DQuick \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml"

inherit rpm
