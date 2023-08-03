SUMMARY = "Development files for the Qt 6 3DQuickInput library"
DESCRIPTION = "Development files for the Qt 6 3DQuickInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquickinput-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2453d522ee7382d6efa0976c2578f1e4fffa1e09da3708103afebc74ecadb05255febeb00497eeb2a1c3056f929b10c92614156c749212e80510d2308bb52a44"

RPROVIDES:${PN} += "cmake-Qt63DQuickInput \
pkgconfig-Qt63DQuickInput \
qt6-3dquickinput-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DInput \
cmake-Qt63DQuick \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickInput6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DInput \
pkgconfig-Qt63DQuick \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml"

inherit rpm
