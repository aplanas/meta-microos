SUMMARY = "A high performance realtime 3D engine"
DESCRIPTION = "The Irrlicht Engine is a realtime 3D engine written and usable in C++ \
and also available for .NET languages. It is using Direct3D, OpenGL \
and its own software renderer, and has features which can be found in \
commercial 3D engines."
LICENSE = "Zlib"

PV = "1.8.5"

RPM_NAME = "libIrrlicht1_8-1.8.5-1.10.aarch64.rpm"
RPM_HASH = "d9c908dbdc94da0cfdd4a727d0d73ca24644e09fc383325d1b9542b9daf2b31dc31967a3b15df39c939efc7a35fc01f2c16e5dd8195fd696d5887856dad77aba"

RPROVIDES:${PN} += "libIrrlicht.so.1.8 \
libIrrlicht1-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
