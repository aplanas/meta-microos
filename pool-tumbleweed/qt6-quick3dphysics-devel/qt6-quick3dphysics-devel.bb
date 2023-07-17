SUMMARY = "Qt 6 Quick3DPhysics library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DPhysics library."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "cff505a0dc825af0db2114d8dab1fbec0b7a9eda8ef17a80d6410f087c685848196ff39af29a0ac32d910402062905a5ae6d83b32e8c9f00b497128e88613d4b"

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
