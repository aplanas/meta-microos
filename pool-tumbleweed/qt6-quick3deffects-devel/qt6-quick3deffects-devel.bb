SUMMARY = "Qt6 Quick3DEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3deffects-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e2b9ddd14323400453a3936a97d85c02ea4572e93dd1e8cca9fb3510739c914799712b04190e8f06ead0cbb88879d505e90e8758334b4c5aff6fc5c1c8ad1ace"

RPROVIDES:${PN} += "cmake-Qt6Quick3DEffects \
pkgconfig-Qt6Quick3DEffects \
qt6-quick3deffects-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6Quick3DEffects6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
qt6-quick3d-private-devel"

inherit rpm
