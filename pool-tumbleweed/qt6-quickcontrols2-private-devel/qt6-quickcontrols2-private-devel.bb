SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "a057734fe9b0ec0afe965067b29695e4048e6004c9a4ad3f37abd5a0dfc28059b9b5effa810b66ec6f6303c70a49642c02b845d1ab4f82fb218b47f7f7ee8a57"

RPROVIDES:${PN} += "qt6-quickcontrols2-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickControls2"

inherit rpm
