SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_video5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "f8fb6459386e1e137aeb5cd3d84895b23f310c66cf317b5150a2b581cc66b39cd26d932f5d5772a56ac270980270daacf36f22aabdaee04cc08b499ee6b3b05c"

RPROVIDES:${PN} += "liballegro-video.so.5.2 \
liballegro-video5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro-audio.so.5.2 \
liballegro.so.5.2 \
libc.so.6 \
libogg.so.0 \
libtheoradec.so.1 \
libvorbis.so.0"

inherit rpm
