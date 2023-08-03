SUMMARY = "Qt 6 Svg library"
DESCRIPTION = "The Qt 6 Svg library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6Svg6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "774bc73c5d48963bdb600ed57a60f8bf6adbea5830f8a8c92a25bff7f280606fb453ddc21298bf2d74a5ef04febd22d4fdd8f3dd7d0879014ecbd8bfa31d270d"

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
