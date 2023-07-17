SUMMARY = "Non-ABI stable API for the Qt 6 ChartsQml Library"
DESCRIPTION = "This package provides private headers of libQt6ChartsQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-chartsqml-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d5677fee36b43fa77abd152be33d3db029c71e7d793084f022ee7c84490d35c9a92e7474cfad2dace49a826a3f05410e7f3e01afc2fd93cde15a7495e43d4872"

RPROVIDES:${PN} += "qt6-chartsqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6ChartsQml"

inherit rpm
