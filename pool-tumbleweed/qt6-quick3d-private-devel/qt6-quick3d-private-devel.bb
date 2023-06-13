SUMMARY = "Non-ABI stable API for the Qt 6 Quick3D library"
DESCRIPTION = "This package provides private headers of libQt6Quick3D that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e4b2ef890a09f9a1ecd0de752c1161050a08bd0f3e0a4fe2bd672794b8a58069afefba2a7c3fb7978df260365e2cc667af89d2360e9c4315f5e40b946aca25e8"

RPROVIDES:${PN} += "qt6-quick3d-private-devel \
qt6-quick3d-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Quick3D) \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel \
qt6-quick3druntimerender-private-devel"

inherit rpm
