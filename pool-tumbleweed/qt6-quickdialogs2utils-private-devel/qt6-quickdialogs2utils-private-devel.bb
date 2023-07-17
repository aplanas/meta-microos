SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Utils that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2utils-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "4bfbf063b3d9987bf9a8d19581697339a3bed937f6020d2319780a4855c6fdf06540fce5c9bfdb87627ff7dc33b0557ba05ba59fba56a3aae0393590e3bce4c5"

RPROVIDES:${PN} += "qt6-quickdialogs2utils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2Utils \
qt6-qmlmodels-private-devel"

inherit rpm
