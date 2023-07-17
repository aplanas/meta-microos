SUMMARY = "Non-ABI stable API for the Qt 6 SQL library"
DESCRIPTION = "This package provides private headers of libQt6Sql that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "442958f3ac99ef3b42b8863bbce226d186b1d1b66660de4bd96acb1bf07a9de9a45c6d40b68abec9ae298d9e30a012f34e24c183ecdf06054999ba1942a75f10"

RPROVIDES:${PN} += "qt6-sql-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Sql \
qt6-core-private-devel"

inherit rpm
