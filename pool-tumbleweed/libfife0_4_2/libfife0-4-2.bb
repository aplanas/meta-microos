SUMMARY = "The Flexible Isometric Free Engine, a 2D game engine"
DESCRIPTION = "FIFE stands for Flexible Isometric Free Engine and is a cross platform \
game creation framework. It provides the ability to create a \
game using Python interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "libfife0_4_2-0.4.2-5.17.aarch64.rpm"
RPM_HASH = "cca383b6b9855fbaa8677b0cadd5e8809efee9da154c7231d2d0c5be4cb3012c13003cf416d669917f0abf89d2c7a877e0b850e45784c4c15f0e2b100537645e"

RPROVIDES:${PN} += "libfife.so.0.4.2 \
libfife0-4-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libfifechan-opengl.so.0.1.5 \
libfifechan-sdl.so.0.1.5 \
libfifechan.so.0.1.5 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libtinyxml.so.0 \
libvorbisfile.so.3 \
libz.so.1"

inherit rpm
