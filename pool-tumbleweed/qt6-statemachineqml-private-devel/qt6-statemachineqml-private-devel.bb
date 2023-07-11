SUMMARY = "Non-ABI stable API for the Qt 6 StateMachineQml library"
DESCRIPTION = "This package provides private headers of libQt6StateMachineQml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachineqml-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b52fb94a3d0ddbec9d070614bcb2ba58365d788dec62b990751d6608bcb2afb3e63af231d06e8360ed43970673349a457d6f77fe022c6dbd7dd67c60de9e170e"

RPROVIDES:${PN} += "qt6-statemachineqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6StateMachineQml \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
