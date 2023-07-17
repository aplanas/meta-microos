SUMMARY = "Qt 6 RemoteObjects library - Development files"
DESCRIPTION = "Development files for the Qt 6 RemoteObjects library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4b356e26a196b7357d44c9b051dbac2454f0c9f7f0f6e3838b06186cef1ffa802e77564fbdf13f849996eb25d70176d98798b708527ba69e55a1511e512f0a85"

RPROVIDES:${PN} += "cmake-Qt6RemoteObjects \
cmake-Qt6RemoteObjectsTools \
pkgconfig-Qt6RemoteObjects \
qt6-remoteobjects-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6Qml \
libQt6RemoteObjects6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
qt6-remoteobjects-tools"

inherit rpm
