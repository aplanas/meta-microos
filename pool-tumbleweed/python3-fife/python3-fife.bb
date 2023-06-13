SUMMARY = "Python 3 extensions for the FIFE engine"
DESCRIPTION = "FIFE stands for Flexible Isometric Free Engine and is a cross platform \
game creation framework. It provides the ability to create a \
game using Python interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "python3-fife-0.4.2-5.16.aarch64.rpm"
RPM_HASH = "0530728876cd39c03be30b90da2581db8532d964b68240a99eee4c6087eef0e29ad8ea64a87f91ec9c666006ef242b51bb7e6f82b7f1923e13607a973612905b"

RPROVIDES:${PN} += "python3-fife \
python3-fife(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libfifechan.so.0.1.5()(64bit) \
libfifechan_opengl.so.0.1.5()(64bit) \
libfifechan_sdl.so.0.1.5()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopenal.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libtinyxml.so.0()(64bit) \
libvorbisfile.so.3()(64bit) \
libz.so.1()(64bit) \
python(abi) \
python3 \
python3-future"

inherit rpm
