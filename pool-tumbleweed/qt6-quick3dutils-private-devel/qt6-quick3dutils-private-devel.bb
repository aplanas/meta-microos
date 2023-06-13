SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DUtils that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dutils-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "7381ba7e57757bad588061d9a12b83188faa4402050d3fb6b57a92cfd9611aafefb840806f5a75143d4e5f1311c34d938bd3bef093a0f78364315f0e7acabbec"

RPROVIDES:${PN} += "qt6-quick3dutils-private-devel \
qt6-quick3dutils-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Quick3DUtils) \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
