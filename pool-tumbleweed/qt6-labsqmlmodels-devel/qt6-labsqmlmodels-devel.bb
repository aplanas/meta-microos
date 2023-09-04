SUMMARY = "Qt 6 LabsQmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsQmlModels library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labsqmlmodels-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "e30a57a6dd52500cd02405b5e7937577ac44c6efea769111ea95a1842e0b1603d9999c42d1b89b3dbfcc86d571c3317e3f4d1da4ac84ee86dad00465b64f0c9d"

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
