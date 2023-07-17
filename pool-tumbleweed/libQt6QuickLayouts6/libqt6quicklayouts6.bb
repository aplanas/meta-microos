SUMMARY = "Qt 6 QuickLayouts library"
DESCRIPTION = "The Qt 6 QuickLayouts library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickLayouts6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "c4369e7fc23ea9b9ac2cd09d51cd48a2259099cdb091b47dd8dd4b10e1fc1afc4aa4af70bef087212a833e3ab95d65637ab0e325e1253b643374abd9f1b00a0d"

RPROVIDES:${PN} += "libQt6QuickLayouts.so.6 \
libQt6QuickLayouts6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
