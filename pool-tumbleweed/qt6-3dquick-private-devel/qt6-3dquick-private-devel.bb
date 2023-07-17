SUMMARY = "Non-ABI stable API for the Qt 6 3DQuick library"
DESCRIPTION = "This package provides private headers of libQt63DQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquick-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "bcb0c5f49600a1c05cd28f4a83687cd1e61c32a7708cd6e4246b8637cbca979226474b185555496e98a21963ec818e055b7df25bcb8e083cf9d4f9197057d7d3"

RPROVIDES:${PN} += "qt6-3dquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuick \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
