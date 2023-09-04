SUMMARY = "Non-ABI stable API for the Qt 6 Pdf library"
DESCRIPTION = "This package provides private headers of libQt6Pdf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdf-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "fbbb7d05be50313289bada2c26427460f358350d3612b836043bf68654cb70b2e2d409176dafd117b1a11ddb12046276d18d359d53132e5316da2138b51ff9ad"

RPROVIDES:${PN} += "qt6-pdf-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Pdf"

inherit rpm
