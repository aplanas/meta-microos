SUMMARY = "Development files for the Qt 6 D-Bus library"
DESCRIPTION = "Development files for the Qt 6 D-Bus library. This package also \
contains Qt6's qdbusxml2cpp and qdbuscpp2xml binaries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-dbus-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "05e66d9565d740f84271b0fe203bfb5855c145df10870e291a4234582de1393e18234fab634fd827512f1e2b8f2a2383fd580659b4cbd16e2e44aafe623df4d4"

RPROVIDES:${PN} += "cmake-Qt6DBus \
cmake-Qt6DBusTools \
pkgconfig-Qt6DBus \
qt6-dbus-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6DBus6 \
pkgconfig-Qt6Core"

inherit rpm
