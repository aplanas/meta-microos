SUMMARY = "Non-ABI stable API for the Qt 6 SQL library"
DESCRIPTION = "This package provides private headers of libQt6Sql that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1f2aa5dc05608aa0bcb65a179215ed86a95890e0c1fb20f08930c3f00902c644eaaaa76292d314e9fbba21f3862460c6680a8d9646f5b8caa66fc52e9f3200a3"

RPROVIDES:${PN} += "qt6-sql-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Sql \
qt6-core-private-devel"

inherit rpm
