SUMMARY = "Non-ABI stable API for the Qt 6 3DExtras library"
DESCRIPTION = "This package provides private headers of libQt63DExtras that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dextras-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "032e48c4532f4cebbe451ebbd13b3b5a6f2c9800bdcc4f68cee84ae56046b1e9a15a986586ce91b4f0c7668b2c516f96314bbbaf4139249bcb8efa354c75b3d2"

RPROVIDES:${PN} += "qt6-3dextras-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DExtras \
qt6-3dcore-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel"

inherit rpm
