SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_memfile5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "bfb3421e73897b01fc2e560de577316246fdb3708fbe554b0953bb28f4098cbbb4b8488da1e9f69d7b9d34ce6fa1f33009cd58b03cf1beef2f3836410a69e0ad"

RPROVIDES:${PN} += "liballegro-memfile.so.5.2 \
liballegro-memfile5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
liballegro.so.5.2 \
libc.so.6"

inherit rpm
