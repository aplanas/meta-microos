SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_acodec5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "9fbadf30019ecf4840c6d1c589ff5b47f7e3860fa64b7de8679176d48f7967ec8a7bb727ada87f2e463f996e340aba816c099e5677a8d684c274bfa8b7f5d133"

RPROVIDES:${PN} += "liballegro-acodec.so.5.2 \
liballegro-acodec5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
liballegro-audio.so.5.2 \
liballegro.so.5.2 \
libc.so.6 \
libdumb.so.2 \
libopusfile.so.0 \
libvorbisfile.so.3"

inherit rpm
