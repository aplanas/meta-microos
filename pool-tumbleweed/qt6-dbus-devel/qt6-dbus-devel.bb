SUMMARY = "Development files for the Qt 6 D-Bus library"
DESCRIPTION = "Development files for the Qt 6 D-Bus library. This package also \
contains Qt6's qdbusxml2cpp and qdbuscpp2xml binaries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-dbus-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "86707ec7cd1bde944bf430caa6e8e4d3e10661c0f4a62d7f4f8c659be2f0c7aa529f0ea527c60c57cc645f6f62d3dd8797c64bca8fac4ee06831d91a04293873"

RPROVIDES:${PN} += "cmake-Qt6DBus \
cmake-Qt6DBusTools \
pkgconfig-Qt6DBus \
qt6-dbus-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6DBus6 \
pkgconfig-Qt6Core"

inherit rpm
