SUMMARY = "Non-ABI stable API for the Qt 6 Quick library"
DESCRIPTION = "This package provides private headers of libQt6Quick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quick-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "c33f9453bc0920066f44b834a4d7a93600eff4a0ce6373912bc806dc18f24255fef62ff8085e01d05b7f301d91e303bcbc4318f2add468dcdbc45110a59a2f0b"

RPROVIDES:${PN} += "qt6-quick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-qmlmodels-private-devel"

inherit rpm
