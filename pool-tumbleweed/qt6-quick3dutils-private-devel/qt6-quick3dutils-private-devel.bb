SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DUtils that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dutils-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "bf2cbd7eed306871227c32b6af00cb81b3cf3d460e77315b91b3ca49e3d177d844a8a3d16ffea18e716ac59f693385c0301af7e70f148df5393b71bedf8c87b1"

RPROVIDES:${PN} += "qt6-quick3dutils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DUtils \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
