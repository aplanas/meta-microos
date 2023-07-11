SUMMARY = "Qt 6 StateMachineQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachineQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachineqml-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b15c99ba8f9cad230c0bd1596178c32bd8b8d66c5e8b10c195a872216427b1f4c1707ea53eeafecf62f548f523af7b9785efbd4cb82fd1e4a815d6f7ae94b053"

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
