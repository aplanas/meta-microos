SUMMARY = "Non-ABI stable API for the Qt 6 SQL library"
DESCRIPTION = "This package provides private headers of libQt6Sql that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "45741b71a0795b6676b2af4cc0de8f114c3f08dcb2dd608c4c583f979a53b1daaa56104bc3a66972ff01668e2e121274a5b9d5c21f41cb845f466643e29395ea"

RPROVIDES:${PN} += "qt6-sql-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Sql \
qt6-core-private-devel"

inherit rpm
