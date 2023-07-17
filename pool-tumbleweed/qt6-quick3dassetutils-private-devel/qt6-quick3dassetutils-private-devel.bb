SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetUtils that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetutils-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "cb3aedc9d129ee683d70c95c422ec1cb9df149589ecfb13d239f45152a7b5aff01da6c4b320b4045aca105a26ac9dca8bcb13cc5524ba45df09c24ba45937cb5"

RPROVIDES:${PN} += "qt6-quick3dassetutils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DAssetUtils \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-quick3d-private-devel \
qt6-quick3dassetimport-private-devel \
qt6-quick3druntimerender-private-devel \
qt6-quicktimeline-private-devel"

inherit rpm
