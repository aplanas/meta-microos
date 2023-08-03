SUMMARY = "Qt 6 HttpServer library - Development files"
DESCRIPTION = "Development files for the Qt 6 HttpServer library."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-httpserver-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1b152284b7eb2a095c34fb29cb62300957cefce8d928aa6960a35b371e144eb4b18fe8395999c5c5229a7a5a0c5d8c505af25604b319a335bc20f6ab24e2a750"

RPROVIDES:${PN} += "cmake-Qt6HttpServer \
pkgconfig-Qt6HttpServer \
qt6-httpserver-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
cmake-Qt6WebSockets \
libQt6HttpServer6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6WebSockets"

inherit rpm
