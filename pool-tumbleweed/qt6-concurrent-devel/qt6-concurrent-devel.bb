SUMMARY = "Development files for the Qt 6 Concurrent library"
DESCRIPTION = "Development files for the Qt 6 Concurrent library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-concurrent-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "bb6fc5cdf0cfeb0db0da411c93b360e394843f3aacbca2a3ecf38ab0cb5a0a6e6d1c182c91e0d261f03885fbd4ebd913a0e5ae3e7304a83396b8e627cff22057"

RPROVIDES:${PN} += "cmake-Qt6Concurrent \
pkgconfig-Qt6Concurrent \
qt6-concurrent-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Concurrent6 \
pkgconfig-Qt6Core"

inherit rpm
