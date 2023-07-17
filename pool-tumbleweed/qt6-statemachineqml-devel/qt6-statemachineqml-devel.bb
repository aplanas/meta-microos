SUMMARY = "Qt 6 StateMachineQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachineQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachineqml-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "25fafc9b2adc5b8f8cd560945253967bcb04c51e29dd27d467d5be0bcd9a0532b002ef46022d0be9caa61429220a68cc8932db30efe3b4ec57e84be24feb5daf"

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
