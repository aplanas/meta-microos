SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetImport library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetImport that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetimport-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "30e6a84f673c1d2b9b722396f4472a0cdda090d7cb3274fa5f076c963edef4a79575074ab1937686cc59775e1939e3237601bcce1cc84b06d06523dcf8c2c01b"

RPROVIDES:${PN} += "qt6-quick3dassetimport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DAssetImport \
qt6-core-private-devel \
qt6-quick3dutils-private-devel"

inherit rpm
