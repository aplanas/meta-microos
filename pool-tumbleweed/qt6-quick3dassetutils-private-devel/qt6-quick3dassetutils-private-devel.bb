SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DAssetUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DAssetUtils that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dassetutils-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "011f44fad2c7111e0aec12c3be2b40756579c7409695e1021d067979375e7104a8edc1e413a62119c076389ae36bb8d86c00186aa3bef99c631fddfcb2a92d04"

RPROVIDES:${PN} += "qt6-quick3dassetutils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DAssetUtils"

inherit rpm
