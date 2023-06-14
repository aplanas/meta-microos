SUMMARY = "Tool for annotating images"
DESCRIPTION = "kImageAnnotator is a tool for annotating images."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "libkImageAnnotator0-0.6.1-1.1.aarch64.rpm"
RPM_HASH = "e5fa260d442449aa6483b2a6920427111b15801ac4da7f5e67f2f2dfca01ec0b28d50a6166808b94f8d0b8396e5333228a48d084233248d02149d7201bea8579"

RPROVIDES:${PN} += "libkImageAnnotator.so.0 \
libkImageAnnotator0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkColorPicker.so.0 \
libstdc++.so.6"

inherit rpm
