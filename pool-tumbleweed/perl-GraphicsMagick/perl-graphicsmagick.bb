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

RPM_NAME = "perl-GraphicsMagick-1.3.40-4.1.aarch64.rpm"
RPM_HASH = "576ca9ee480dd0b08a2c409bd17c1ecd3d19585b9968196572927f4c0807a5795ef1ebca0e39326f18f3fbf8f9e8e1c5986c31c8d8c3b77d87c1f1ba490f7a8d"

RPROVIDES:${PN} += "perl-Graphics--Magick \
perl-GraphicsMagick"

RDEPENDS:${PN} += "GraphicsMagick \
ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libm.so.6 \
perl"

inherit rpm
