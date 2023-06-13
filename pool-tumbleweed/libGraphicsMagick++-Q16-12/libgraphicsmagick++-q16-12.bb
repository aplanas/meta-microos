SUMMARY = "C++ interface for the GraphisMagick image conversion library"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images. \
 \
This subpackage contains C++ interface to GraphicsMagick library."
LICENSE = "MIT"

PV = "1.3.40"

RPM_NAME = "libGraphicsMagick++-Q16-12-1.3.40-2.3.aarch64.rpm"
RPM_HASH = "14096a18bbbeda13e8c05e8c845aa3e981059d93644fb0f6cb35af43fc6e9f4be27c8fffc70779ff578b14f0c5abb1b845cf2cf5d70fbe1f817cdbab3368f4d3"

RPROVIDES:${PN} += "libGraphicsMagick++-Q16-12 \
libGraphicsMagick++-Q16-12(aarch-64) \
libGraphicsMagick++-Q16.so.12()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGraphicsMagick-Q16.so.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
