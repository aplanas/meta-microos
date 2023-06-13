SUMMARY = "Hardware-accelerated multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-Kivy-2.1.0-3.6.aarch64.rpm"
RPM_HASH = "fa20f14b5c0ce23d6ee254e478316ceb2c21f38b46d8daef91a69cbcdfe37c6d79f043ec23ce555ec4ad98e8dd3c74f35b559e0767fc458672cb90cd256f46ca"

RPROVIDES:${PN} += "python3.11dist(kivy) \
python311-Kivy \
python311-Kivy(aarch-64) \
python3dist(kivy)"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) \
libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
mtdev \
python(abi) \
python311-Pillow \
python311-Pygments \
python311-docutils \
python311-pyenchant \
xclip"

inherit rpm
