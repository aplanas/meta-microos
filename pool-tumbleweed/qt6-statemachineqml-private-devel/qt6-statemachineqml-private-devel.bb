SUMMARY = "Non-ABI stable API for the Qt 6 StateMachineQml library"
DESCRIPTION = "This package provides private headers of libQt6StateMachineQml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-statemachineqml-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "25e0e6c2da1fdcf37963c3ab027a4b57986c7d10466d8be997dc3f0d85a7b0c25ce41ba855b8d6cc06e599f5563bdfc8365f02070a9a7e3d32e23510120f55e4"

RPROVIDES:${PN} += "qt6-statemachineqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6StateMachineQml"

inherit rpm
