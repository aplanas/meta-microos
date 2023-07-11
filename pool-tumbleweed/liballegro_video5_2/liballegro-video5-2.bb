SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_video5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "8da4981c4740af401d0f97a0317c4c76ded0eed28e2f89af721f7174380b02837f0359011fe6b273de0ed380b575f29e72e03fadef6e6962b5b27139240ece00"

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
