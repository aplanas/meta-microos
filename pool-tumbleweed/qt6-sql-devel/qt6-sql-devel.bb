SUMMARY = "Development files for the Qt 6 SQL library"
DESCRIPTION = "Development files for the Qt 6 SQL library"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "43be54f247b431f109b8fe138acd180e91987055fda5aafe87f9b6b96f105db6aa5fbfd13f902b29fd2c018e526abababc61beb0fc4327a747223297b6439346"

RPROVIDES:${PN} += "cmake-Qt6Sql \
pkgconfig-Qt6Sql \
qt6-sql-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Sql6 \
pkgconfig-Qt6Core"

inherit rpm
