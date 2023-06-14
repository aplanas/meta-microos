SUMMARY = "Non-ABI stable API for the Qt 6 StateMachineQml library"
DESCRIPTION = "This package provides private headers of libQt6StateMachineQml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachineqml-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f508b0cd6ae867122fdd24db2608e0e1e1bff8278e4dec25ca705c98b8d420a58c494069eddf607af4d74b86daeaa39fa1ffc6de06bfec819ca453d98424ceb4"

RPROVIDES:${PN} += "qt6-statemachineqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6StateMachineQml \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
