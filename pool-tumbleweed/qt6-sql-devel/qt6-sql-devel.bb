SUMMARY = "Development files for the Qt 6 SQL library"
DESCRIPTION = "Development files for the Qt 6 SQL library"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-sql-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "80e7cdcd6d7e569645357980fc36ddd48008a8ed491ce8bb55e20017b5ae0cac452a8141ec47a8763658a47c8f33e3191eb6706065b273e9b1b1851e0fdbd37e"

RPROVIDES:${PN} += "cmake-Qt6Sql \
pkgconfig-Qt6Sql \
qt6-sql-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Sql6 \
pkgconfig-Qt6Core"

inherit rpm
