SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_color5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "b0e60c18816703a55727b9b6b8cc157a82c28c634825bce41d0e12d352098e8d35980721f487968772f572c90c49b92c36e6af829336fa65a5f89622ce43cbb9"

RPROVIDES:${PN} += "liballegro_color.so.5.2()(64bit) \
liballegro_color5_2 \
liballegro_color5_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
liballegro.so.5.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
