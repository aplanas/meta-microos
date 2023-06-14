SUMMARY = "Examples for the qt6-svg modules"
DESCRIPTION = "Examples for the qt6-svg modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-svg-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d11ff9b5373cafb4adb14bee4d372630e94c06b5e2aa7eae2552624b10307d85bc1b5083e323fdec67aaea23197074fec64e7ea70922de9438afa41faba5fa06"

RPROVIDES:${PN} += "qt6-svg-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
