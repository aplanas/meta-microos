SUMMARY = "Non-ABI stable API for the Qt 6 Quick3D library"
DESCRIPTION = "This package provides private headers of libQt6Quick3D that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3d-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b63eec1ada73dc39a866c9a7ef5e1f9f8129a97e8c54e1d94560bd5c752f40af8d1abee503a45e964a2a865853fef28be9cb65e526fb47b3c0df83e46be932dd"

RPROVIDES:${PN} += "qt6-quick3d-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3D \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel \
qt6-quick3druntimerender-private-devel"

inherit rpm
