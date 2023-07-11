SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-webenginequick-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "a231c58ac10fafcbb1165663a06fa4aabfbd3ad77bd9bbfd21f78ee3d6e82e8d9d01b1de8d7d5295f194a169361972470d583666a436919be1ff290b2e7eac42"

RPROVIDES:${PN} += "qt6-webenginequick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineQuick"

inherit rpm
