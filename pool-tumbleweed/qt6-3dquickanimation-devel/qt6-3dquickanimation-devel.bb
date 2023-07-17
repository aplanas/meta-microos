SUMMARY = "Development files for the Qt 6 3DQuickAnimation library"
DESCRIPTION = "Development files for the Qt 6 3DQuickAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickanimation-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0a21c35b27eb999277609dd2e810bd8e5f2016be8478c0e9b62755aa3babe8bfe26ce14965e2bbe4160b25ac39b84dd28b73d43eaf636c6edbe255b65a1cf9df"

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
