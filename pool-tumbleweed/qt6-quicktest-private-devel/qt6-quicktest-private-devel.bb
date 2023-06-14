SUMMARY = "Non-ABI stable API for the Qt 6 QuickTest library"
DESCRIPTION = "This package provides private headers of libQt6QuickTest that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicktest-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "1801e35dc53c4f3b4de7a99b66da593481bb837fdf1d9c8fb2fd4b062fcf37f1801bd35c12ea9fbf284e51378da7ef8fbdcb08138951d30531fa036d429540cf"

RPROVIDES:${PN} += "qt6-quicktest-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTest \
qt6-test-private-devel"

inherit rpm
