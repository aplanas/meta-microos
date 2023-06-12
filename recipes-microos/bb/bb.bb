SUMMARY = "Audio-Visual Demonstration for Text Terminal"
DESCRIPTION = "BB is a high quality audio-visual demonstration for your text terminal. \
 It is a portable demo, so you can run it on plenty of operating \
systems and DOS."
LICENSE = "GPL-2.0+"

PV = "1.3"

RPM_NAME = "bb-1.3-575.23.aarch64.rpm"
RPM_HASH = "c253125a455f27d012237fae80160fdde1de1091c68f95c3d3f7d4bedfeeed1bfb2d17105105a8957c6301540200fc85b4e69d7d5c9fa81a60578d611af89b10"

RPROVIDES:${PN} += "bb \
bb(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaa.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblzo2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmikmod.so.3()(64bit)"

inherit rpm
