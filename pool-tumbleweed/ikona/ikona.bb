SUMMARY = "Icon Preview designed for Plasma"
DESCRIPTION = "A utility to preview icons as they are being made."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "ikona-0.7.1-1.15.aarch64.rpm"
RPM_HASH = "cea6b4a8058f07db69fa8733181ed931ba806a4286dcccd2f9a9ba9675044251f084eeca536cb3e63c37ba5a422d16a87f6114631976362f4d1ecbe8a3e88f1a"

RPROVIDES:${PN} += "ikona"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5WebEngine.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
plasma-framework-components"

inherit rpm
