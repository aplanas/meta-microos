SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_color5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "d1ade46edac241a1100237792fc56f22617e4f27e5f695c711718dd0e2b167f96023d653beb6ea548d7a95f614d97971b5d1d19c2fe4b5fb38c8da4ed941e051"

RPROVIDES:${PN} += "liballegro-color.so.5.2 \
liballegro-color5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libc.so.6 \
libm.so.6"

inherit rpm
