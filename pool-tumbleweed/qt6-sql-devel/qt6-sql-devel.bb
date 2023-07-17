SUMMARY = "Development files for the Qt 6 SQL library"
DESCRIPTION = "Development files for the Qt 6 SQL library"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "58117f1f86dc53ccd8f0b287c0490f342d9f8d29e0710b1988b5f79d8d783f24e082012c57e384729ace8859a97115e1603de0f83f46363225f16f9812343619"

RPROVIDES:${PN} += "cmake-Qt6Sql \
pkgconfig-Qt6Sql \
qt6-sql-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Sql6 \
pkgconfig-Qt6Core"

inherit rpm
