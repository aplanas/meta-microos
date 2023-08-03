SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickcontrols2-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "666ec66c815b2192f8073933693f10f8ba2036ee0f9b78a5a08a36fb87270f94ea021b239271742f8483ef8868d8a12645db6eafcf46203ba30eb3bd6dc07275"

RPROVIDES:${PN} += "qt6-quickcontrols2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2"

inherit rpm
