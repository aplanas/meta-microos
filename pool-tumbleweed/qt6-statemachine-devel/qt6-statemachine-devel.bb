SUMMARY = "Qt 6 StateMachine library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachine library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-statemachine-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "049e07eba6d547538a1f8ef00f7beca1f0035225a8b781381a3d29e3465f968459ff439306e9c47501c73245a0676fc545d4db659b707f2298db393cc21cff3d"

RPROVIDES:${PN} += "cmake-Qt6StateMachine \
pkgconfig-Qt6StateMachine \
qt6-statemachine-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6StateMachine6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
