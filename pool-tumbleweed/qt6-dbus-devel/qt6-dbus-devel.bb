SUMMARY = "Development files for the Qt 6 D-Bus library"
DESCRIPTION = "Development files for the Qt 6 D-Bus library. This package also \
contains Qt6's qdbusxml2cpp and qdbuscpp2xml binaries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-dbus-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "d0a00992d07faf1f58e8ddc0b97151d4f091d5d58b1c02881a6c7779ff8d331cf5d668f432932019187c22099bae6c0ba69a91c756418a878e66eb24d717c530"

RPROVIDES:${PN} += "cmake-Qt6DBus \
cmake-Qt6DBusTools \
pkgconfig-Qt6DBus \
qt6-dbus-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6DBus6 \
pkgconfig-Qt6Core"

inherit rpm
