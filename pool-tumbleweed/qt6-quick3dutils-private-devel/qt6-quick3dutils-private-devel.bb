SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DUtils that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dutils-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "24026339ebb23c382b8577d40561f740950794a2ca10eb5c556542f33175a0b22c925a1a0e24ed6d6bc16a40445b0092dadb723dfd862a482803f4ba764d1b8c"

RPROVIDES:${PN} += "qt6-quick3dutils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DUtils \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
