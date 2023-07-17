SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DPhysics library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DPhysics that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0bd36240e3b8e083092d7c324a02435d7b92d62428ab73f95941cb8bafbdfcc55a537cc3403d059a991e4ea9c09ebacd1bdb4accacf7021a914927a10564d024"

RPROVIDES:${PN} += "qt6-quick3dphysics-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3D \
cmake-Qt6Quick3DPhysics \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
