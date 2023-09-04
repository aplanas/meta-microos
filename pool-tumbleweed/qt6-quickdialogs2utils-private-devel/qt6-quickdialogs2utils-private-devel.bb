SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Utils that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2utils-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "9de23f29ca71e87060f3ce31002eac9f4aa214cd687f8e3374f8ecbc3549ae039736965533d762811847e24f069ea4cafc1ce9d2f415fca8b7f79850bb032550"

RPROVIDES:${PN} += "qt6-quickdialogs2utils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2Utils \
qt6-qmlmodels-private-devel"

inherit rpm
