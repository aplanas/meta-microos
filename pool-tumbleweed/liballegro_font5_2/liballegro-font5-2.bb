SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_font5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "e82846563f762e95bb9f4013d3122451d1aba76c3dd89c1b03dbd10c4943b0bb83ade87346868adda639cf74837274ed18a4c4e616153f976c10aca80690f4af"

RPROVIDES:${PN} += "liballegro-font.so.5.2 \
liballegro-font5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libc.so.6"

inherit rpm
