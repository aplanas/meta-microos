SUMMARY = "Development files for the Qt 6 D-Bus library"
DESCRIPTION = "Development files for the Qt 6 D-Bus library. This package also \
contains Qt6's qdbusxml2cpp and qdbuscpp2xml binaries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-dbus-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "9246fbf6d8bf727f6e20a25b091909c5bd69850c7c30534d43c412a5eda20da49d794fd2a19cdbedee3688ed9a79dc7eea856c0f675d67919807d729310b9ecc"

RPROVIDES:${PN} += "cmake-Qt6DBus \
cmake-Qt6DBusTools \
pkgconfig-Qt6DBus \
qt6-dbus-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6DBus6 \
pkgconfig-Qt6Core"

inherit rpm
