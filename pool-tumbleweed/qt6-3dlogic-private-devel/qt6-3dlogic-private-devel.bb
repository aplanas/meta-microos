SUMMARY = "Non-ABI stable API for the Qt 6 3DLogic library"
DESCRIPTION = "This package provides private headers of libQt63DLogic that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dlogic-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8e799f7123ab52203d7b2bcd32796da3bdabee5da6fa2c3c26b1541168cdc9da327dbb437d7cc6934b5d5350abdc30f7b5e1fae393e48656822d84a1f9717bd8"

RPROVIDES:${PN} += "qt6-3dlogic-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DLogic \
qt6-3dcore-private-devel \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
