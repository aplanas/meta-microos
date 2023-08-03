SUMMARY = "Qt 6 LabsFolderListModel library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsFolderListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labsfolderlistmodel-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2a3026cee2115289d809d094525a83c93f4f3f6749945abcec507bc82c5bdfe205965287cc078646f48b797cf72b04936862143eb83e7ee0152d4b3244fea44d"

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
