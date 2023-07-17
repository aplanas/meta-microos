SUMMARY = "Non-ABI stable API for the Qt 6 QuickLayouts library"
DESCRIPTION = "This package provides private headers of libQt6QuickLayouts that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicklayouts-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "46a5b63f01226b764b2cbe310d22992d3792ab4f529414dc8efddb0615ab24659b22541e42eec831d40a872f5f3775a006f0734700833a60fdc6c956637d4870"

RPROVIDES:${PN} += "qt6-quicklayouts-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickLayouts"

inherit rpm
