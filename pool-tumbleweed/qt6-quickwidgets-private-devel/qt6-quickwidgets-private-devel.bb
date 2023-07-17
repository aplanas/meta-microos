SUMMARY = "Non-ABI stable API for the Qt 6 QuickWidgets library"
DESCRIPTION = "This package provides private headers of libQt6QuickWidgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickwidgets-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "aa5e35060a5dce3710a343f118b0345ec540dab58174e3d588e2eb8a7e286b463c5bfa60ae4a247334d0e014b8d6f582a6e86c06ca5d9aa7be15d46f83e49283"

RPROVIDES:${PN} += "qt6-quickwidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickWidgets \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel \
qt6-widgets-private-devel"

inherit rpm
