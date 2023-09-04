SUMMARY = "Qt 6 LabsFolderListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsFolderListModel library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labsfolderlistmodel-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "e8c655211a4237a7f7fcdd68bf019b87b6579f4e380d91ad39f7f64872866fe4eb55bf135a7f777f32a7e642091f2218f97faa60837430add5411e96ab0fabd3"

RPROVIDES:${PN} += "cmake-Qt6LabsFolderListModel \
pkgconfig-Qt6LabsFolderListModel \
qt6-labsfolderlistmodel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsFolderListModel6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6QmlModels \
qt6-core-private-devel \
qt6-qml-private-devel \
qt6-qmlmodels-private-devel"

inherit rpm
