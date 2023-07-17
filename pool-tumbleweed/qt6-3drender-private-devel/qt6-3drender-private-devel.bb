SUMMARY = "Non-ABI stable API for the Qt 6 3DRender library"
DESCRIPTION = "This package provides private headers of libQt63DRender that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3drender-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fcc97bc705e6ebc46a05dbbcced3a48f54ca8d460fe4b80e89290fe5ab6aba63d0e137caf2d235938c5402975a7187f25d7d697a224fb90cc144bc853a203cee"

RPROVIDES:${PN} += "qt6-3drender-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DRender \
cmake-Qt6Concurrent \
qt6-3dcore-private-devel \
qt6-core-private-devel"

inherit rpm
