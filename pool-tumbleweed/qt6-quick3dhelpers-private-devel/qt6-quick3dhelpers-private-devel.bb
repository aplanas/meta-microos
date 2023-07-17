SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpers library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpers that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpers-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d105d06d8f8fd1689646e8360a6bd5128737c97478650024619ecce7b99282802b843413d36dbec6abc9d238a0b3265eb6a271b7498898b90970e40293df201e"

RPROVIDES:${PN} += "qt6-quick3dhelpers-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DHelpers"

inherit rpm
