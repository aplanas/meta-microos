SUMMARY = "Non-ABI stable API for the Qt 6 QuickWidgets library"
DESCRIPTION = "This package provides private headers of libQt6QuickWidgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickwidgets-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d337c37863bcec6ca1e7188a11afc9f30509998d66cfb56cafbaf43fbe02640c679252a28e252b149f3e7d613158c1a883ac91f2751e2b75569617ba67250f05"

RPROVIDES:${PN} += "qt6-quickwidgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickWidgets \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel \
qt6-widgets-private-devel"

inherit rpm
