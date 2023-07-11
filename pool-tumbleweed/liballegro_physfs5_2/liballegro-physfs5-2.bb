SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_physfs5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "ec097b450aedd8439833286817516ff76cf63019f3ffc57b34bf943be777194305b141f80b04cddadfa788e223a42f07a2099e0f92b57c89b27e002b88e07d3a"

RPROVIDES:${PN} += "liballegro-physfs.so.5.2 \
liballegro-physfs5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libc.so.6 \
libphysfs.so.1"

inherit rpm
