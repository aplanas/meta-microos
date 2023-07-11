SUMMARY = "Non-ABI stable API for the Qt 6 QuickLayouts library"
DESCRIPTION = "This package provides private headers of libQt6QuickLayouts that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicklayouts-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "e9161e005a56101bbcc30c6c26cbd8379fa2a35bbfe65ced35fcad85fb783dc55492e81d7d95837fe1d20aa8dadaa6aea997a7eb525407557b44fe5def8a5591"

RPROVIDES:${PN} += "qt6-quicklayouts-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickLayouts"

inherit rpm
