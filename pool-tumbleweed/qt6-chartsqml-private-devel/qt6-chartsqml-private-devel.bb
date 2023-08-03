SUMMARY = "Non-ABI stable API for the Qt 6 ChartsQml Library"
DESCRIPTION = "This package provides private headers of libQt6ChartsQml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-chartsqml-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "81495f47029b3dbce88723c0b019f816bfa303b0409e4643b76a8afab9fcdc90f33c9f3ffab61f3c4625b3603dc4d94b6b53d661f921b24ad96775cf02ffce0d"

RPROVIDES:${PN} += "qt6-chartsqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6ChartsQml"

inherit rpm
