SUMMARY = "Non-ABI stable API for the Qt 6 3DRender library"
DESCRIPTION = "This package provides private headers of libQt63DRender that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3drender-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7baa050803845dd395c1096dfd1690af9a8245a95f94e1a88c49f3eda8f6c766e7df0940fad628b2f911ee1af38b901c754ea52f2982336298c8c5fc980a55a8"

RPROVIDES:${PN} += "qt6-3drender-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DRender \
cmake-Qt6Concurrent \
qt6-3dcore-private-devel \
qt6-core-private-devel"

inherit rpm
