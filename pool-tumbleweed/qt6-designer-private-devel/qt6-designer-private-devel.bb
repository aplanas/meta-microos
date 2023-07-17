SUMMARY = "Non-ABI stable API for the Qt 6 Designer libraries"
DESCRIPTION = "This package provides private headers of libQt6Designer that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-designer-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "ce43941fa883ea7fa3d776b9be27552ee44a9b4518d1a86d4ad3aaf30b0572868640093953104c95888a7e12f170a09450c19dcd576aa3ffb8b4c7bd7abb469f"

RPROVIDES:${PN} += "qt6-designer-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Designer \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
