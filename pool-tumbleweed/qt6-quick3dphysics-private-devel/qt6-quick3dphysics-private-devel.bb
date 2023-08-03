SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DPhysics library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DPhysics that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dphysics-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6179ee3354fd764276592b4dbc64c183ae07aa71136903240ba6727ed959cda2460a4d3ac237c35132c2eaefa87abf94c7a99bb8913623f7a47e8e238040f20b"

RPROVIDES:${PN} += "qt6-quick3dphysics-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3D \
cmake-Qt6Quick3DPhysics \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
