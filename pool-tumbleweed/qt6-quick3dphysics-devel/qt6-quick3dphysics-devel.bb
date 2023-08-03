SUMMARY = "Qt 6 Quick3DPhysics library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DPhysics library."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dphysics-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a9862814ca77fa8a48f42cc9a9acef6c415672ee3f20cced90e3b7a9a8d4773f5fcc637be1b0c152b3394eff14a2f24828491736863de6b80031282c520e7fda"

RPROVIDES:${PN} += "cmake-Qt6Quick3DPhysics \
pkgconfig-Qt6Quick3DPhysics \
qt6-quick3dphysics-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3D \
libQt6Quick3DPhysics6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D"

inherit rpm
