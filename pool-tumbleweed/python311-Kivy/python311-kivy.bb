SUMMARY = "Hardware-accelerated multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python311-Kivy-2.2.1-1.1.aarch64.rpm"
RPM_HASH = "ead217a39cea01433824bc745bba93040ad8ac954feab2ea434ed223c9a7eda81196e1cf4162d22c42283be925f77e6fc67fab8143a77cfbdcdbe6e499f874fb"

RPROVIDES:${PN} += "python3-Kivy \
python3.11dist-kivy \
python311-Kivy \
python3dist-kivy"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
mtdev \
python-abi \
python311-Pillow \
python311-Pygments \
python311-docutils \
python311-pyenchant \
xclip"

inherit rpm
