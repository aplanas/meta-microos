SUMMARY = "Qt 6 QuickControls2Impl library"
DESCRIPTION = "The Qt 6 QuickControls2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickControls2Impl6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "eb9f73785144da57a69dca96fcf6a72676e0ef6389676026bd44ac762e0a2c5d3f6c89f50718e818dca3b0e261e9d10145b5341b85fa7a3f100912c28fb2fbc6"

RPROVIDES:${PN} += "libQt6QuickControls2Impl.so.6 \
libQt6QuickControls2Impl6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickTemplates2.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
