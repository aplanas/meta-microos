SUMMARY = "Non-ABI stable API for the Qt 6 LabsFolderListModel library"
DESCRIPTION = "This package provides private headers of libQt6LabsFolderListModel that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsfolderlistmodel-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "2564733beb0113d5a07e77066db7247a40bbeccbf1e7f2602253b5f47b2b154f0b4c56c4863262df96939585f29734fe25f3749c312295c96b7b02e1896773a1"

RPROVIDES:${PN} += "qt6-labsfolderlistmodel-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsFolderListModel"

inherit rpm
