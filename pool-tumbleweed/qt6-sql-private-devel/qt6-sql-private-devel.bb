SUMMARY = "Non-ABI stable API for the Qt 6 SQL library"
DESCRIPTION = "This package provides private headers of libQt6Sql that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-sql-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b684014196b73b7d54dce0b7142037f8b165be377839f01385d1caa4312649f20fbfd34e4b25e1d7235b6eb017228baf6db2f692b54bc4c36aafa67054e74712"

RPROVIDES:${PN} += "qt6-sql-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Sql \
qt6-core-private-devel"

inherit rpm
