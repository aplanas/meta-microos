SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DUtils that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dutils-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "a79315fdae0e468557a66d920c64397e0a933ecef01daaf360a0f7324a97b0dd4eb63e2d44cf2dc654d30ce90d238d071d20818aa1eedc6d77ced290dd7cf955"

RPROVIDES:${PN} += "qt6-quick3dutils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DUtils \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
