SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_primitives5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "9c4afdb490b6f79752d285fd2544e275557735911b75109cf535402de939300644ab020629a0cb7f51f17050352bf071ccd381aa81655470ac83d7a62ebc51af"

RPROVIDES:${PN} += "liballegro-primitives.so.5.2 \
liballegro-primitives5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
liballegro.so.5.2 \
libc.so.6 \
libm.so.6"

inherit rpm
