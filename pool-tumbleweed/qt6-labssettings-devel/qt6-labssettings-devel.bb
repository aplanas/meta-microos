SUMMARY = "Qt 6 LabsSettings library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSettings library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssettings-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "180a9b5bf9190df92aa952342d2b5342b2215b46d651630ea5bb2434f71183e501090f1dd04c6744649dff6f932cba25c8badba9330426ada8780d0c4d22e26b"

RPROVIDES:${PN} += "cmake-Qt6LabsSettings \
pkgconfig-Qt6LabsSettings \
qt6-labssettings-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6LabsSettings6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
