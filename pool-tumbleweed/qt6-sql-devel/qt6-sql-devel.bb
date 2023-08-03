SUMMARY = "Development files for the Qt 6 SQL library"
DESCRIPTION = "Development files for the Qt 6 SQL library"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-sql-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "82cf3c4010fcddadd8e43dea8850d071d748aa418fcd49cb3ab411f6cee01e7fc689c21fb79214bd887c272f8230b68f2361008d1688a722e57f3e55f9c87e7a"

RPROVIDES:${PN} += "cmake-Qt6Sql \
pkgconfig-Qt6Sql \
qt6-sql-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Sql6 \
pkgconfig-Qt6Core"

inherit rpm
