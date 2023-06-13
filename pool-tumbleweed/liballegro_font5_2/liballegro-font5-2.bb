SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_font5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "8a7691c2dfd46e0d4090f047e5c6f111a5fba3aa872429cf73ea103fbff8425117c50dbbfb3767a0402015c4ebbd21e56dc2f9b3322f20e995b16eb41fe5abff"

RPROVIDES:${PN} += "liballegro_font.so.5.2()(64bit) \
liballegro_font5_2 \
liballegro_font5_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
liballegro.so.5.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
