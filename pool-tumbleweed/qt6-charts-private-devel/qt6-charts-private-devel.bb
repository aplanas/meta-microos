SUMMARY = "Non-ABI stable API for the Qt 6 Charts Library"
DESCRIPTION = "This package provides private headers of libQt6Charts that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-charts-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "be101dd836f7561285254df1c5a313829c774b45fe3efc1b357739006a3d194862357a0db4393b8dc25e5bf3e089e6ba598c4cd39f12acbd4d8f5170d6bda31d"

RPROVIDES:${PN} += "qt6-charts-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Charts"

inherit rpm
