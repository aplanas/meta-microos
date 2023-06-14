SUMMARY = "Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "The Qt 6 QuickDialogs2Utils library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickDialogs2Utils6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b582ee8c0c12c3112e576891e8eca2eb5449930f6f156baa8b0c6e7ef99ab403c63128fcc5fb824f9f40e246dbd00cb28f11b9e7bc2885511ba6e6a332dab2ea"

RPROVIDES:${PN} += "libQt6QuickDialogs2Utils.so.6 \
libQt6QuickDialogs2Utils6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
