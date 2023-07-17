SUMMARY = "Qt 6 WebView library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebView library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webview-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "50e08945d8fdb438e0cb81e74d1d0bba2195d7924e14f08fd10975868e75027eb7fc4abbf728cd5d783755b8b2ab51462117dac2fb3097916f7e35144e346bc6"

RPROVIDES:${PN} += "cmake-Qt6WebView \
pkgconfig-Qt6WebView \
qt6-webview-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6WebView6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
