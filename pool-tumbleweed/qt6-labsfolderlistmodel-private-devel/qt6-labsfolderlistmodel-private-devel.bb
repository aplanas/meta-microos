SUMMARY = "Non-ABI stable API for the Qt 6 LabsFolderListModel library"
DESCRIPTION = "This package provides private headers of libQt6LabsFolderListModel that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsfolderlistmodel-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "f4bc8ec8edcace4f59bece15b7bb5cdf1ecd569d1261215d12d5a03f4c527b2341e7eaa664ad7655179370844ffaa8012ab5033e8eebcecbcd4d119becef3d07"

RPROVIDES:${PN} += "qt6-labsfolderlistmodel-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsFolderListModel"

inherit rpm
