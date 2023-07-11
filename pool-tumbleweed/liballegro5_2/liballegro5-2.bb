SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "20fe31a9b89c2c8f05f0dd77c0f099d83f50cded192134f699817ce988de4428eaf0e68141f1ec4fb8b4508756f52944f3d975739861997d31f51458087d4da8"

RPROVIDES:${PN} += "config-liballegro5-2 \
liballegro.so.5.2 \
liballegro5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libX11.so.6 \
libXcursor.so.1 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
