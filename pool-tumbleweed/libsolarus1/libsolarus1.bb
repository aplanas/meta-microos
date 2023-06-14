SUMMARY = "Solarus game engine shared library"
DESCRIPTION = "This package provides the main shared library of the Solarus game \
engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "libsolarus1-1.6.5-2.15.aarch64.rpm"
RPM_HASH = "a9d0d8447088cf4a3f49fd81f9e9fd1f000834c023a7c8fce44c810301a7abd702443424d387dc9c0f5e45e28da9aed9795ac0c3cd6d470d20870fb9c9d6a94c"

RPROVIDES:${PN} += "libsolarus.so.1 \
libsolarus1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libluajit-5.1.so.2 \
libm.so.6 \
libmodplug.so.1 \
libopenal.so.1 \
libphysfs.so.1 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3"

inherit rpm
