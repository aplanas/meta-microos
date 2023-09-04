SUMMARY = "Non-ABI stable API for the Qt 6 SQL library"
DESCRIPTION = "This package provides private headers of libQt6Sql that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-sql-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "d820126c7f55fe553cee8f8c5bcb9832d3930ead94d817710d68db08b22010018721495abb144058d73433a63fb71997b2eff48e520a1805f638449b5cb2b192"

RPROVIDES:${PN} += "qt6-sql-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Sql \
qt6-core-private-devel"

inherit rpm
