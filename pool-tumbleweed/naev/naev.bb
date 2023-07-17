SUMMARY = "2D action RPG space game"
DESCRIPTION = "Naev is a 2D space trading and combat game, in a similar vein to Escape Velocity. \
 \
Naev is played from a top-down perspective, featuring fast-paced combat, many ships, \
a large variety of equipment and a large galaxy to explore. The game is \
open-ended, letting you proceed at your own pace."
LICENSE = "GPL-3.0-only"

PV = "0.10.6"

RPM_NAME = "naev-0.10.6-1.1.aarch64.rpm"
RPM_HASH = "9d13332507da9b2d45c661db590ae22212d245964a3954bcb5fdcdf67a32ed23629abf8dcfa31334b7354224a1d233690de314a347e6a9543a39f60ec78aad8b"

RPROVIDES:${PN} += "naev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libc.so.6 \
libcholmod.so.3 \
libcxsparse.so.3 \
libenet.so.7 \
libfreetype.so.6 \
libglpk.so.40 \
libluajit-5.1.so.2 \
libm.so.6 \
libopenal.so.1 \
libopenblas.so.0 \
libpcre2-8.so.0 \
libphysfs.so.1 \
libunibreak.so.5 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libxml2.so.2"

inherit rpm
