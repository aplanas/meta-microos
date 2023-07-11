SUMMARY = "Perl interface for the GraphicsMagick image conversion library"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images. \
 \
This package contains perl interface to GraphicsMagick library."
LICENSE = "MIT"

PV = "1.3.40"

RPM_NAME = "perl-GraphicsMagick-1.3.40-2.4.aarch64.rpm"
RPM_HASH = "392c9084efd093770b6c08c8c9ae5227ab3738f2bc958fc9468bfb6fdb900814d3e990a81b5b479b0df3f5940dd24052b66b7637fb922ce5675df924089472e0"

RPROVIDES:${PN} += "perl-Graphics--Magick \
perl-GraphicsMagick"

RDEPENDS:${PN} += "GraphicsMagick \
ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libm.so.6 \
perl"

inherit rpm
