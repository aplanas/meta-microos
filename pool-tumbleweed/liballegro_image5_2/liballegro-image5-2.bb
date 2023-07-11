SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_image5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "6c828b76065df97fa27d0beab8c7bd21043b80b39de262f705af20e4d41cec0a7408f9729214faaaf60964293eebc3e30765ab4d72ae2c1803d4db95c89d3419"

RPROVIDES:${PN} += "liballegro-image.so.5.2 \
liballegro-image5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libc.so.6 \
libfreeimage.so.3 \
libjpeg.so.8 \
libpng16.so.16 \
libwebp.so.7"

inherit rpm
