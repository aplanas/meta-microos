SUMMARY = "Hardware-accelerated multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-Kivy-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "72180e19ab02f41adae904749d84236476e08d6dbd4c7adf0e7fce239cc62af682f2d6b384b2e07e4c43b7fe66fda53f89657e01e54c761f071dc4f4728e8603"

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
