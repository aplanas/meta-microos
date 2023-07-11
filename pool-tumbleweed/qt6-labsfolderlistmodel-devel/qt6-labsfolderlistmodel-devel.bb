SUMMARY = "Qt 6 LabsFolderListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsFolderListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsfolderlistmodel-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "fd9262f2ba8f7d2fe905fdbffaaf8a94f8ef2455e1c93c7d0b4d7d0883fe8bc4e3fdfeb58ad82d832ed78f934d19ecbe3872e1d3675c5f4420dc81fa8d3330ab"

RPROVIDES:${PN} += "cmake-Qt6LabsFolderListModel \
pkgconfig-Qt6LabsFolderListModel \
qt6-labsfolderlistmodel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsFolderListModel6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6QmlModels \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
