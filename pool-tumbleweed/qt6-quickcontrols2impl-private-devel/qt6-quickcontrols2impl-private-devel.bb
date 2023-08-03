SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2Impl that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickcontrols2impl-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "552183d4ba8be3178983df92ca7fa4f749a60bc1ec6705d779224c02751553c65f39e2cbf68c45e89e8bd24a4f599eeceaec06737daccc07a1c8ddf10d46a2c9"

RPROVIDES:${PN} += "qt6-quickcontrols2impl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2Impl"

inherit rpm
