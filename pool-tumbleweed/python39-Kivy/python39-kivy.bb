SUMMARY = "Hardware-accelerated multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-Kivy-2.1.0-3.6.aarch64.rpm"
RPM_HASH = "388ecca744b78be63a71a9fd3ff5c936fbe27152803722b35742946f58d556cd188a9020ddc1225c1536e57b28573c3ce8cbf80560a8e29bd4acd820f606ee92"

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
