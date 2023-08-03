SUMMARY = "Development files for the Qt 6 Network library"
DESCRIPTION = "Development files for the Qt 6 Network library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-network-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0b33dd3caf79a6275e7942e2d95d4769ce88a71d0d8c6866164401668a3df15ac111cae716e93cb5c61e3575c7d3c64f8afa1365efca01543de05fecf61f4113"

RPROVIDES:${PN} += "cmake-Qt6Network \
pkgconfig-Qt6Network \
qt6-network-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Network6 \
pkgconfig-Qt6Core"

inherit rpm
