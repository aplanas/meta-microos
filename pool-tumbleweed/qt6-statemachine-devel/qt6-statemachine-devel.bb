SUMMARY = "Qt 6 StateMachine library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachine library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachine-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "8a6843bc82508638d35a34bf339d54304a6c43610f1ccab3b5626cd383f0a0c148a2c8e93c105e4d82ec43cb6a18d53b3fbe14d490a100746b27540f6504036c"

RPROVIDES:${PN} += "cmake-Qt6StateMachine \
pkgconfig-Qt6StateMachine \
qt6-statemachine-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6StateMachine6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
