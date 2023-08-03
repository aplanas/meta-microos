SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetUtils that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dassetutils-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "935275bb483759d4cd9bfbc894a0138ce12f9f4dae94f77d2edfd110af0fd9cda9b9e42b62fefeb419fe765f1e5d9f00cb1c9ea902a7448623826a1dde3e5803"

RPROVIDES:${PN} += "qt6-quick3dassetutils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DAssetUtils \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-quick3d-private-devel \
qt6-quick3dassetimport-private-devel \
qt6-quick3druntimerender-private-devel \
qt6-quicktimeline-private-devel"

inherit rpm
