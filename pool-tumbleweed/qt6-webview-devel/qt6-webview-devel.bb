SUMMARY = "Qt 6 WebView library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebView library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webview-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2ce2dddb480cad3d3a5b57a92eddfd3dd9a1b3b6462cc6aca8ded39511e5863c29f287b84f776434a5b9bbe5c481f2dd3ef74287d9b11b010968a3a9f9b408d2"

RPROVIDES:${PN} += "cmake-Qt6WebView \
pkgconfig-Qt6WebView \
qt6-webview-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6WebView6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
