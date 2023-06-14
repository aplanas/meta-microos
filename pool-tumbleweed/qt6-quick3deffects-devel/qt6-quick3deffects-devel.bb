SUMMARY = "Qt6 Quick3DEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3deffects-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "033ee96f9037691f761f34e62c1bbb6037646e1ede2f67fec5075198ebd05a509864b729656810dad2fe7788515286500688210c65f31be7b1cd7cf21d23e56e"

RPROVIDES:${PN} += "cmake-Qt6Quick3DEffects \
pkgconfig-Qt6Quick3DEffects \
qt6-quick3deffects-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6Quick3DEffects6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
qt6-quick3d-private-devel"

inherit rpm
