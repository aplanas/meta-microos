SUMMARY = "2D action RPG space game"
DESCRIPTION = "Naev is a 2D space trading and combat game, in a similar vein to Escape Velocity. \
 \
Naev is played from a top-down perspective, featuring fast-paced combat, many ships, \
a large variety of equipment and a large galaxy to explore. The game is \
open-ended, letting you proceed at your own pace."
LICENSE = "GPL-3.0-only"

PV = "0.10.5"

RPM_NAME = "naev-0.10.5-1.2.aarch64.rpm"
RPM_HASH = "ae784ca15dd7545794d802f0143a503c2c8b65ba96d1ce0602607f13cb805c56c23bbb1185efbeaf6188592d96cdd538b7059994f4adc44a75fe83a229a2a3a5"

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
