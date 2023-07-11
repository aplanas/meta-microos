SUMMARY = "Non-ABI stable API for the Qt 6 QuickWidgets library"
DESCRIPTION = "This package provides private headers of libQt6QuickWidgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickwidgets-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "08374617e9e6cb514307e33b4789b2bec4c05b19049be4076b542daf6df32302e78e754bc2bc25ba48c8122cd801ac0302564b47792b277aa2afeda2555349c1"

RPROVIDES:${PN} += "qt6-quickwidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickWidgets \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel \
qt6-widgets-private-devel"

inherit rpm
