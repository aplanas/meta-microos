SUMMARY = "Hardware-accelerated multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-Kivy-2.1.0-3.6.aarch64.rpm"
RPM_HASH = "fa20f14b5c0ce23d6ee254e478316ceb2c21f38b46d8daef91a69cbcdfe37c6d79f043ec23ce555ec4ad98e8dd3c74f35b559e0767fc458672cb90cd256f46ca"

RPROVIDES:${PN} += "python3.11dist-kivy \
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
