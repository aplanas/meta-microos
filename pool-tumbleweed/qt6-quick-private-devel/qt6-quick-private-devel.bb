SUMMARY = "Non-ABI stable API for the Qt 6 Quick library"
DESCRIPTION = "This package provides private headers of libQt6Quick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quick-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "ce28633cb3956706dd8801a5892493e10622604f09253c4e1fefd2f952f87eaa23260b6ff1623a0aaacc031831edcc80cfac22c60da3655875a43c14b8cb6954"

RPROVIDES:${PN} += "qt6-quick-private-devel \
qt6-quick-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Quick) \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-qmlmodels-private-devel"

inherit rpm
