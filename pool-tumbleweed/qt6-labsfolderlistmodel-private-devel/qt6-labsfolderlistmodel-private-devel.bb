SUMMARY = "Non-ABI stable API for the Qt 6 LabsFolderListModel library"
DESCRIPTION = "This package provides private headers of libQt6LabsFolderListModel that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labsfolderlistmodel-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5e8a6c09a461dde78ca2b1ec756a50f0b15be9c4624a32d8f5290232425138d2fae8726a98c66e1bc6d752e6b8066f7b088a771e588525112c975c2b205b423f"

RPROVIDES:${PN} += "qt6-labsfolderlistmodel-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsFolderListModel"

inherit rpm
