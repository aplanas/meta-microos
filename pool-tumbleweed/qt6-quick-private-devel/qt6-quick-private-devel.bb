SUMMARY = "Non-ABI stable API for the Qt 6 Quick library"
DESCRIPTION = "This package provides private headers of libQt6Quick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quick-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "c1c924b8a52cfb7825ed1ace79212d197b9dbd51dbb9d8dd5b3c73ff9b9bab8537076b7e1cacefe2a61168ad644d73310266de1977e4aa04c6e6c4f659eab0d1"

RPROVIDES:${PN} += "qt6-quick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-qmlmodels-private-devel"

inherit rpm
