SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_ttf5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "82035eac052b4eebe51d523549aaa04494825a8d4c18a05c5da79bfcbe1e32ae923a42d47f07b5910d69b855549f9de33aee8a750e79f8f609d430aab0e4e6ed"

RPROVIDES:${PN} += "liballegro-ttf.so.5.2 \
liballegro-ttf5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro-font.so.5.2 \
liballegro.so.5.2 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
