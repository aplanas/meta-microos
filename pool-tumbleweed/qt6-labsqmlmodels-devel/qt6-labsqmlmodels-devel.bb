SUMMARY = "Qt 6 LabsQmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsQmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsqmlmodels-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "991880a01901726dda1530073fc3fbcd5b34110a75a622cdf01cee553c94c6dcd9a82400b7edeb666753a3745cd1bb7537ec24290d2910f0eaf5ebba00b81419"

RPROVIDES:${PN} += "cmake-Qt6LabsQmlModels \
pkgconfig-Qt6LabsQmlModels \
qt6-labsqmlmodels-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsQmlModels6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6QmlModels \
qt6-qml-private-devel \
qt6-qmlmodels-private-devel"

inherit rpm
