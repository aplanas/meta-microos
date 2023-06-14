SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpers library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpers that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpers-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "bd4251308c152ab63b272e30eca095e84d551ae9345b40127ae2deea8336e829769bbfd1498b325ec20fad092d41d94ed4aa06a832574a8bc2e8e6251a0b23ac"

RPROVIDES:${PN} += "qt6-quick3dhelpers-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DHelpers"

inherit rpm
