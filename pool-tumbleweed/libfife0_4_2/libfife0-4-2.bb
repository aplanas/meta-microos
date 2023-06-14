SUMMARY = "The Flexible Isometric Free Engine, a 2D game engine"
DESCRIPTION = "FIFE stands for Flexible Isometric Free Engine and is a cross platform \
game creation framework. It provides the ability to create a \
game using Python interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "libfife0_4_2-0.4.2-5.16.aarch64.rpm"
RPM_HASH = "aae1c5b22c7a24e038d349ee70d5287a82fcf0f17457aaa5af5958f4fcc4dee3465259e82056c133ae1e87ff313ddde347dd0b642a897561f37e404b445f1bbe"

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
