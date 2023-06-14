SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_audio5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "41abc4790c1f368f80f3e39bee51d1cc53d0ef7f0e7f42635fc472042a257f8262037a4009b351d01210419634fb76561582bcb1ebe2a00d5624ec613e8ff49c"

RPROVIDES:${PN} += "liballegro-audio.so.5.2 \
liballegro-audio5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libopenal.so.1 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
