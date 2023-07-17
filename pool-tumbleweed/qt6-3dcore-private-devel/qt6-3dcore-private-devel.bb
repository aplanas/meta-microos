SUMMARY = "Non-ABI stable API for the Qt 6 3DCore library"
DESCRIPTION = "This package provides private headers of libQt63DCore that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dcore-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b97726eca9993c08d4bfb47894f2011549f7474becca6b266eaba65f7635f22c64eb03dd55e3c8d27e3622df6d48f3759b4e461174d16b52f7b0fecfb17bd4a7"

RPROVIDES:${PN} += "qt6-3dcore-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCore \
cmake-Qt6Concurrent \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
