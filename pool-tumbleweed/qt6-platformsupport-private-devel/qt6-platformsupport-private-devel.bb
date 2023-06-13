SUMMARY = "Non-ABI stable API for the  Qt6 PlatformSupport library"
DESCRIPTION = "This package provides private headers of libQt6PlatformSupport that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-platformsupport-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "17239f922447b92cb85c78a89014bc7a7695d97a6e906e73718ce30c173694297bfe5af3ee950a8007c1b268e67b52b1af23de76b9fd40b9b2e8cdded3511f9a"

RPROVIDES:${PN} += "qt6-platformsupport-private-devel \
qt6-platformsupport-private-devel(aarch-64)"

RDEPENDS:${PN} += "qt6-platformsupport-devel-static"

inherit rpm
