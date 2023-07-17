SUMMARY = "Development files for the Qt 6 Concurrent library"
DESCRIPTION = "Development files for the Qt 6 Concurrent library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-concurrent-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "2ae0232b10284d141a031c1f4014f83295341a9b65ddb4f932065b95556b4ae2d8939a400ed13f1252e8d51a9b8d7b9fdbb8b359caba90cae0235105c77e2640"

RPROVIDES:${PN} += "cmake-Qt6Concurrent \
pkgconfig-Qt6Concurrent \
qt6-concurrent-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Concurrent6 \
pkgconfig-Qt6Core"

inherit rpm
