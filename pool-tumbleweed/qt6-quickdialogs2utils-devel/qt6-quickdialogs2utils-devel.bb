SUMMARY = "Qt6 QuickDialogs2Utils library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Utils library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2utils-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "5c40e67bf2cae388faf5d692b3780857a9e547a800aa9e6ff80cc5d95aea18b66126d94e6ede8c8994409f91e3638c1407cc92fffa3959e005af9b44592da201"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2Utils \
pkgconfig-Qt6QuickDialogs2Utils \
qt6-quickdialogs2utils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6QuickDialogs2Utils6 \
pkgconfig-Qt6Core"

inherit rpm
