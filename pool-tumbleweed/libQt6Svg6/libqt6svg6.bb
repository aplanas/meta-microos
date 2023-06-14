SUMMARY = "Qt 6 Svg library"
DESCRIPTION = "The Qt 6 Svg library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Svg6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "bb01839abe4c475bccf97f7fd63ad45ffebc19461f92a9600bce4a60a528e41c1e7f1bf01735ff8fb9dbf7173e14d8c1e052117d0f4433b9eabddc6d8b1df230"

RPROVIDES:${PN} += "libQt6Svg.so.6 \
libQt6Svg6 \
libqsvg.so \
libqsvgicon.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
