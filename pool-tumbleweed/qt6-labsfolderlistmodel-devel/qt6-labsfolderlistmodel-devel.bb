SUMMARY = "Qt 6 LabsFolderListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsFolderListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsfolderlistmodel-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "9402b4e4219060d715a61ce2d3dae6e327925e2a3f991db28b09bb298dc51e93997b9884c8f2a8ece36a0376a26cfb38185af22424dcdd3e22489ec8e0b4fc5c"

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
