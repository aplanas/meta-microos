SUMMARY = "Non-ABI stable API for the Qt 6 PrintSupport library"
DESCRIPTION = "This package provides private headers of libQt6PrintSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-printsupport-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "42e4acf8dc27eac54e3563fab75ba7a2cd03974ef61014321d05ae79da65cd6f1ed2b3fb67f5031ded7c4e7ca5b174b59110a93850279ea1e61600aa16412d49"

RPROVIDES:${PN} += "qt6-printsupport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PrintSupport \
cups-devel \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
