SUMMARY = "Non-ABI stable API for the Qt 6 LabsFolderListModel library"
DESCRIPTION = "This package provides private headers of libQt6LabsFolderListModel that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labsfolderlistmodel-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "d5c31124581208bdeda61730073ca11e855bd4791adb2e4a7f640196e468433f4f9063d1e47dfbb1f8c77fca47f260f12d83f78deb090221d45c68579c41e957"

RPROVIDES:${PN} += "qt6-labsfolderlistmodel-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsFolderListModel"

inherit rpm
