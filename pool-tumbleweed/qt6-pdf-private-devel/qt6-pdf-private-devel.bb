SUMMARY = "Non-ABI stable API for the Qt 6 Pdf library"
DESCRIPTION = "This package provides private headers of libQt6Pdf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-pdf-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d59212bc537756546ddb452320fd083a03d305bc24d0f183990d16686cb0e49779c6263caca10a34f3b7bc3b2b54cdd7eb9b21e58699d1118590791707d93e92"

RPROVIDES:${PN} += "qt6-pdf-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Pdf"

inherit rpm
