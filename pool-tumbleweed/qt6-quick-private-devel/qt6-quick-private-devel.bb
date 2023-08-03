SUMMARY = "Non-ABI stable API for the Qt 6 Quick library"
DESCRIPTION = "This package provides private headers of libQt6Quick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quick-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0dcd669a7f656a4cd4ce970a02fd3ec9041c1d4cd93a22581fa45443929558d5125c214478fc5a35659132a802af3f94188b53c7db25724d3731741930abdcb0"

RPROVIDES:${PN} += "qt6-quick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-qmlmodels-private-devel"

inherit rpm
