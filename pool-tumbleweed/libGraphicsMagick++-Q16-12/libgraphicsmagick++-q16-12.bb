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

RPM_NAME = "libGraphicsMagick++-Q16-12-1.3.40-5.1.aarch64.rpm"
RPM_HASH = "28edbcb74fef34b33acc8422be6028d94ac1fdd18452c80534ab6e6ff766c4356a54e0b9cfc52aa4b218c7e5cec80b71c01f0aab39851f63ca012f5436028345"

RPROVIDES:${PN} += "libGraphicsMagick++-Q16-12 \
libGraphicsMagick++-Q16.so.12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
