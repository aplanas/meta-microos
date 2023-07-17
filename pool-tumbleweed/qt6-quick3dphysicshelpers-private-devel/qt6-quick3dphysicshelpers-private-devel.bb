SUMMARY = "Qt 6 Quick3DPhysicsHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DPhysics private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysicshelpers-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b18b40306715ffbf14fd3a40b09bc8f714c50a377953466064fa6b7466f13cc9d4ac09a9e1c9bc2aa917b8b3113c37bbc99e92e781465a41372b9bf9454715ea"

RPROVIDES:${PN} += "cmake-Qt6Quick3DPhysicsHelpers \
pkgconfig-Qt6Quick3DPhysicsHelpers \
qt6-quick3dphysicshelpers-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3D \
libQt6Quick3DPhysicsHelpers6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
qt6-quick3dphysics-private-devel"

inherit rpm
