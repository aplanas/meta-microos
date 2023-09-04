SUMMARY = "Non-ABI stable API for the Qt 6 QuickWidgets library"
DESCRIPTION = "This package provides private headers of libQt6QuickWidgets that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickwidgets-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "33c74795d735db930adcbe5b629627592a3df14de00a505acb2ee9a022fd357f6545464ec1a59ae5d084d92cfd2891be112042d35d3f88a19df5a98687ce4124"

RPROVIDES:${PN} += "qt6-quickwidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickWidgets \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel \
qt6-widgets-private-devel"

inherit rpm
