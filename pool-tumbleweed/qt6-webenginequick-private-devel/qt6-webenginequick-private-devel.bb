SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginequick-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d460a67f1ac0ecb7f91534022233185f90463b997de95bd94078dd514a7915c2268b81c52a6b9bd7e966097d17068d3c7e68ae9a4f89927bebc2d3b7eb392a98"

RPROVIDES:${PN} += "qt6-webenginequick-private-devel \
qt6-webenginequick-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6WebEngineQuick)"

inherit rpm
