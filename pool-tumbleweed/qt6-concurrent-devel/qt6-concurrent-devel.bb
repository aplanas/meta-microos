SUMMARY = "Development files for the Qt 6 Concurrent library"
DESCRIPTION = "Development files for the Qt 6 Concurrent library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-concurrent-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "97328d589278f5e18efea8baaac57c140056853cf76e289993a8f3207b0a65174a09a9296da1f35c3e1e453e6a5ddef574ccbcd7adfa87e74c6c2bf4bebf6518"

RPROVIDES:${PN} += "cmake-Qt6Concurrent \
pkgconfig-Qt6Concurrent \
qt6-concurrent-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Concurrent6 \
pkgconfig-Qt6Core"

inherit rpm
