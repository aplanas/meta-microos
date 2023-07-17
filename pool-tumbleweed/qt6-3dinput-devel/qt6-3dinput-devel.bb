SUMMARY = "Development files for the Qt 6 3DInput library"
DESCRIPTION = "Development files for the Qt 6 3DInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dinput-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "7f910d883b11b80c8c9198b453cc09d38251cb0dd36de4f32aaeb5fcc413ce94a0bce28265e56282fdc9fa8bb0c3df8e9e14da22af5871d5533ad76dfe281ee9"

RPROVIDES:${PN} += "cmake-Qt63DInput \
pkgconfig-Qt63DInput \
qt6-3dinput-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt6Gui \
libQt63DInput6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
