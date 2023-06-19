SUMMARY = "Non-ABI stable API for the Qt 6 Help library"
DESCRIPTION = "This package provides private headers of libQt6Help that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-help-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "696221a0c366297969a3cbf2f91b0dbb84f11c3acb1b3523800a8fb9f6afe48bc94e46d9cf09a451a60722a4d5631d2288e397f0f289543f5c843cd8571613b6"

RPROVIDES:${PN} += "qt6-help-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Help \
qt6-core-private-devel"

inherit rpm
