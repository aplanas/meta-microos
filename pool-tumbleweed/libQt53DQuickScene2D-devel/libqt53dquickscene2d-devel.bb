SUMMARY = "Development files for the Qt 5 3D Quick Scene 2D library"
DESCRIPTION = "Development files for the Qt 5 3D Quick Scene 2D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuickScene2D-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "429dc5d9d658a31de44ef8616e6db8196c8ed68f164e942c88752e2257bdb78d06fbaff3c0d64f970cb0e0b6e3895c216bda7898584ef1f96333573f44636a85"

RPROVIDES:${PN} += "cmake-Qt53DQuickScene2D \
libQt53DQuickScene2D-devel \
pkgconfig-Qt53DQuickScene2D"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickScene2D5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DQuick \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml"

inherit rpm
