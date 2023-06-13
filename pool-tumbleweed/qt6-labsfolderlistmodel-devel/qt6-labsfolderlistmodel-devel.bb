SUMMARY = "Qt 6 LabsFolderListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsFolderListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsfolderlistmodel-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "15a408bdd29e83d0ac12a806f6d0e1565f78fdcb38b82f9feb1fbacb72fcb4a5845e789f1a05aa2589d699a2ac722bc614e3c97251364d2d8c91cf84ee99fd7b"

RPROVIDES:${PN} += "cmake(Qt6LabsFolderListModel) \
pkgconfig(Qt6LabsFolderListModel) \
qt6-labsfolderlistmodel-devel \
qt6-labsfolderlistmodel-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsFolderListModel6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6QmlModels) \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
