SUMMARY = "Qt 6 ScxmlQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 ScxmlQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxmlqml-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dfed5684a5aaafb78ca931f53c99470138faf8fb23d2f79743182f8725eef265ddcad03672cb897e7e108234ea6a716310755a619ec1f7442ba0321e6ab4048c"

RPROVIDES:${PN} += "cmake-Qt6ScxmlQml \
pkgconfig-Qt6ScxmlQml \
qt6-scxmlqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Scxml \
libQt6ScxmlQml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Scxml"

inherit rpm
