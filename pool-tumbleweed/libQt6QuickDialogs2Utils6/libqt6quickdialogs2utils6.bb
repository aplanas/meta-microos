SUMMARY = "Qt 6 QuickDialogs2Utils library"
DESCRIPTION = "The Qt 6 QuickDialogs2Utils library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickDialogs2Utils6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "38bbde622097e1d1826c621f913d40ba3f3368553c63a23266572d79a39fb984c8aaebfe234f0607d7264374aa38d57b9c7c3940f7219f39ec94c04c69701755"

RPROVIDES:${PN} += "libQt6QuickDialogs2Utils.so.6 \
libQt6QuickDialogs2Utils6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
