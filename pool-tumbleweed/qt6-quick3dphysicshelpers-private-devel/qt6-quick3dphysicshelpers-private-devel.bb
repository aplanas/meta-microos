SUMMARY = "Qt 6 Quick3DPhysicsHelpers library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DPhysics private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dphysicshelpers-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ec075686a32758befdefad0b2be567a90c682066832cdbdd8952585ab34cfb826b3655c2ee0d1d873b27f9d9169c19c9786295d13bb87dcad35252be6b080c9c"

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
