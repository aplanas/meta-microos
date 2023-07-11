SUMMARY = "Hardware-accelerated multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-Kivy-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "59e70a1e65e34048a3d46b9b3d278342f08c37997201be12589616db2fe26bd3fc4debb836b357b68fbe63bb587ff74b02647432acbc8c63cbe8bd35df19424e"

RPROVIDES:${PN} += "python3.9dist-kivy \
python39-Kivy \
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
python39-Pillow \
python39-Pygments \
python39-docutils \
python39-pyenchant \
xclip"

inherit rpm
