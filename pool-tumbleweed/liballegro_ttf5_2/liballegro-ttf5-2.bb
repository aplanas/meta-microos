SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_ttf5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "65a0df4b2dfdfa5411428d873f8f7b3ade533ab32b194e1e9259a03b3f595575b1f9b3b5138787bacf6327a32bb8197e04b6bfe661f30f7dd5939f40d69a9483"

RPROVIDES:${PN} += "liballegro_ttf.so.5.2()(64bit) \
liballegro_ttf5_2 \
liballegro_ttf5_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
liballegro.so.5.2()(64bit) \
liballegro_font.so.5.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfreetype.so.6()(64bit)"

inherit rpm
