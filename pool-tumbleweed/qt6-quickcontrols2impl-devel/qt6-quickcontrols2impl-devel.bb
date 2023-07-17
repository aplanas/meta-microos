SUMMARY = "Qt6 QuickControls2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2impl-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "55cf466b7ee0cfda2dee5fac6074b63c4a3d379626e5b312cc9494a3adf0e67c591f8702e1f51099b2c49ea9a43391dc3ce32be5c764cbd8b840c6205b74ba65"

RPROVIDES:${PN} += "cmake-Qt6QuickControls2Impl \
pkgconfig-Qt6QuickControls2Impl \
qt6-quickcontrols2impl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickTemplates2 \
libQt6QuickControls2Impl6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
