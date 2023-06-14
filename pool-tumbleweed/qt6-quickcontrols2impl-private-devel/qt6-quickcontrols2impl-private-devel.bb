SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2Impl that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2impl-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "9c5571d4ce935a5017e16339aae4cab10da2d797a98d0cb83815df2b282e35068467260e73fb3af218b5dfa1686e5050971149a238e4650ab3c2bb8a4fa83bbc"

RPROVIDES:${PN} += "qt6-quickcontrols2impl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2Impl"

inherit rpm
