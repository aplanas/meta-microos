SUMMARY = "Development headers and libraries for irrlicht"
DESCRIPTION = "Development headers and libraries for irrlicht. \
 \
The Irrlicht Engine is a realtime 3D engine written and usable in C++ \
and also available for .NET languages. It is using Direct3D, OpenGL \
and its own software renderer, and has features which can be found in \
commercial 3D engines."
LICENSE = "Zlib"

PV = "1.8.5"

RPM_NAME = "irrlicht-devel-1.8.5-1.9.aarch64.rpm"
RPM_HASH = "9c5946dea1b83f7f2a169b30770f45b50ca5436cd4f927d771c9936f60717ce540cb709e11fdde7681cc22c799b318db0572eae8985b62c638f8ef8b71602422"

RPROVIDES:${PN} += "irrlicht-devel \
irrlicht-devel(aarch-64)"

RDEPENDS:${PN} += "libIrrlicht1_8 \
libstdc++-devel"

inherit rpm
