SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetImport library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetImport that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dassetimport-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "951719052d163fe01470abd3fd46abaea85909c11caae5fdd4fe30ce67600448c21a055b7798171aa02a604719f1839f5d9536c3d444011794a37a0df1f32003"

RPROVIDES:${PN} += "qt6-quick3dassetimport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DAssetImport \
qt6-core-private-devel \
qt6-quick3dutils-private-devel"

inherit rpm
