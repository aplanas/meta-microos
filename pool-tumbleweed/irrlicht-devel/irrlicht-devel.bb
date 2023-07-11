SUMMARY = "Development headers and libraries for irrlicht"
DESCRIPTION = "Development headers and libraries for irrlicht. \
 \
The Irrlicht Engine is a realtime 3D engine written and usable in C++ \
and also available for .NET languages. It is using Direct3D, OpenGL \
and its own software renderer, and has features which can be found in \
commercial 3D engines."
LICENSE = "Zlib"

PV = "1.8.5"

RPM_NAME = "irrlicht-devel-1.8.5-1.10.aarch64.rpm"
RPM_HASH = "cf72d205cf961e0f161f75d546c96e4450c58ec8eb2a432b6b02cb72b0aebd95b3d31a0fc55443818152ab57708b8fd9af7c6da8cc6b88df1882b101ed07fb99"

RPROVIDES:${PN} += "irrlicht-devel"

RDEPENDS:${PN} += "libIrrlicht1-8 \
libstdc++-devel"

inherit rpm
