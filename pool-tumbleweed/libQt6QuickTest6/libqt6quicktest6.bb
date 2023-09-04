SUMMARY = "Qt 6 QuickTest library"
DESCRIPTION = "The Qt 6 QuickTest library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickTest6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "eb4d09eb2caadb33e7ac1498efb6cf9cd4e8dc73fa1467a3a1ee421407375fe6f0ad62587e2f0878f923d77c88a7beb094b2bc8f8f77f0f7b0de9bde63e4de6e"

RPROVIDES:${PN} += "libQt6QuickTest.so.6 \
libQt6QuickTest6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Test.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
