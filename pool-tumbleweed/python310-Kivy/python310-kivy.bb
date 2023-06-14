SUMMARY = "Hardware-accelerated multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-Kivy-2.1.0-3.6.aarch64.rpm"
RPM_HASH = "c44864b98bfbd9f9e93fbecc2d37aa9b92f5a514d9666106eb877dd216162b00338c399b11749ca94a66777ed1c8b1a13d97a71bf4cf4104fd55700df6010dcf"

RPROVIDES:${PN} += "python3-Kivy \
python3.10dist-kivy \
python310-Kivy \
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
python310-Pillow \
python310-Pygments \
python310-docutils \
python310-pyenchant \
xclip"

inherit rpm
