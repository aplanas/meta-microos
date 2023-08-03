SUMMARY = "Qt 6 StateMachineQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachineQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-statemachineqml-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "da58f2aadcaa5b13353d96b72d31557ab755360916abaed340c2f3b69e7b7bbe426b85706234bcadce09e36bfa106b0d07d19d5248392f5700ea016f457fe6a7"

RPROVIDES:${PN} += "cmake-Qt6StateMachineQml \
pkgconfig-Qt6StateMachineQml \
qt6-statemachineqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6StateMachine \
libQt6StateMachineQml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6StateMachine"

inherit rpm
