SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetImport library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetImport that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetimport-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "978211315256b78663114db766208f75cb63ce77a95160384bc2044c71f34e416ecc252b0277e4a9cf877ca249e35c59da64e9c50fc8e7a3139a5d9cd8664447"

RPROVIDES:${PN} += "qt6-quick3dassetimport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DAssetImport \
qt6-core-private-devel \
qt6-quick3dutils-private-devel"

inherit rpm
