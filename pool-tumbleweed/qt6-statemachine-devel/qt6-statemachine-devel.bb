SUMMARY = "Qt 6 StateMachine library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachine library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachine-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "121b4e8b5b730f60dcb1e72d2d1bf1bdc55ad34da0a21742a184826300b785b2cf078296c3912e943933af1ca40f2718550e00d28870495eef3325abf389c480"

RPROVIDES:${PN} += "cmake-Qt6StateMachine \
pkgconfig-Qt6StateMachine \
qt6-statemachine-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6StateMachine6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
