SUMMARY = "Python 3 extensions for the FIFE engine"
DESCRIPTION = "FIFE stands for Flexible Isometric Free Engine and is a cross platform \
game creation framework. It provides the ability to create a \
game using Python interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "python3-fife-0.4.2-5.17.aarch64.rpm"
RPM_HASH = "e69edc4394cfd805b9182b097341b17e7d1fff7870154e47c912b9bef3c03857eebf04ff89e39a9a8d2c2c8c43a423e261b47eb672c0e398546d4545e47526fe"

RPROVIDES:${PN} += "python3-fife"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
libpython3.11.so.1.0 \
libstdc++.so.6 \
libtinyxml.so.0 \
libvorbisfile.so.3 \
libz.so.1 \
python-abi \
python3 \
python3-future"

inherit rpm
