SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_acodec5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "e4390b145d9c8848191200b762b2cdab3ae49e0837c3377759e68b1eb7a059ca931fd037ed4eb400a119351ea8f0a7fe425db11ecce455bed3def4a8347264bc"

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
