SUMMARY = "A high performance realtime 3D engine"
DESCRIPTION = "The Irrlicht Engine is a realtime 3D engine written and usable in C++ \
and also available for .NET languages. It is using Direct3D, OpenGL \
and its own software renderer, and has features which can be found in \
commercial 3D engines."
LICENSE = "Zlib"

PV = "1.8.5"

RPM_NAME = "libIrrlicht1_8-1.8.5-1.9.aarch64.rpm"
RPM_HASH = "82053338a496e858a36e5a3b5b0521358010cacd4b11ba7a246927ae304eb7c949b6907486a7aa125578a602fafadce6df721884aa0c1878cd7e2441115ea9fe"

RPROVIDES:${PN} += "libIrrlicht.so.1.8()(64bit) \
libIrrlicht1_8 \
libIrrlicht1_8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXxf86vm.so.1()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit)"

inherit rpm
