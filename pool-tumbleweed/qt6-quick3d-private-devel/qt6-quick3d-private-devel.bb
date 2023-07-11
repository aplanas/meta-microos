SUMMARY = "Non-ABI stable API for the Qt 6 Quick3D library"
DESCRIPTION = "This package provides private headers of libQt6Quick3D that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "0286fac6f63b647190215bafd67f5f8c90107402b797f1e6546b90989d583df7f01460345c49593b21a73ad23a85a69f819c09e135b1798cda34e3dab76948e4"

RPROVIDES:${PN} += "qt6-quick3d-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3D \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel \
qt6-quick3druntimerender-private-devel"

inherit rpm
