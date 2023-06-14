SUMMARY = "Non-ABI stable API for the Qt 6 Network library"
DESCRIPTION = "This package provides private headers of libQt6Network that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-network-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "484995e4cea8d82be7c3ad9a24daa351d6e67732f71a30cddeeeca813fd279ac1a1777d26c9cdeb5a6629f4719c47c1698856027e9acf24e7a0d4b7182d0d7ed"

RPROVIDES:${PN} += "qt6-network-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
libopenssl-3-devel \
qt6-core-private-devel"

inherit rpm
