SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DPhysics library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DPhysics that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "766cab7fb28e8d2d7fe96980b4293b4108e6b839e0ebeac3f2a1ecde495fb7720107001905c1bc84375a64f3160ad3cfe5e886bcc199d0c66224387c1d5057b2"

RPROVIDES:${PN} += "qt6-quick3dphysics-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DPhysics \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
