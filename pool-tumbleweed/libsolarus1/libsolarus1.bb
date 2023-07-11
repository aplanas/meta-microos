SUMMARY = "Solarus game engine shared library"
DESCRIPTION = "This package provides the main shared library of the Solarus game \
engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "libsolarus1-1.6.5-2.16.aarch64.rpm"
RPM_HASH = "d76f4b78fa4fa93435307e0ffe35b1cfdf313c010adcbdf2e25bb96ac08ef24fc15c6e74f0517978375ad7af0397f373421f7742170f996b8128cbdea2c419ac"

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
