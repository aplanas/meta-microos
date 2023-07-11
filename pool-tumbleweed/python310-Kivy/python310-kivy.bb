SUMMARY = "Hardware-accelerated multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-Kivy-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "68bd4bf8e635363ad9c96cab0a174ad41cd073d5a0fade08a195380af8348e7cd697464cf0baed8323296c32c87df17ca20164cf84de033181fbe9780a518b8f"

RPROVIDES:${PN} += "python3.10dist-kivy \
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
