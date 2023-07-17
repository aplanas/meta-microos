SUMMARY = "Qt6 Quick3DEffects library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DEffects library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3deffects-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f8211edf5153bd329cca49617cfd023fa6a7355d1c251e6ce5c51fa2f819a3dd3ad3c0b16a7d08454f7ace523b2af52cc66687ff427f426f288b6caf7755fbd9"

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
