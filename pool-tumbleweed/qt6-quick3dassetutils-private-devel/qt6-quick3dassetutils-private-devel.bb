SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetUtils that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetutils-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "996231f27a8a6a3948f200807dcdff198c6a56cd191b66bc3f35d9d36df4d361594236eec9363972e5eb6a6e83cd2f1f07e0f97ddc60e872096de26cb202f417"

RPROVIDES:${PN} += "qt6-quick3dassetutils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DAssetUtils"

inherit rpm
