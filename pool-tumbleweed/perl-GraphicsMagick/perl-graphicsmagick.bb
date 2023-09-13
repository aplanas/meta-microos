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

RPM_NAME = "perl-GraphicsMagick-1.3.40-5.1.aarch64.rpm"
RPM_HASH = "3dd1373c58d7f4c3473561f1e8a6055e75b0cd60a7430b7be97483ea8c9f91748119f607275acb10dfac04577f14aa233d33b2a0d616c6295198100d89a42f74"

RPROVIDES:${PN} += "perl-Graphics--Magick \
perl-GraphicsMagick"

RDEPENDS:${PN} += "GraphicsMagick \
ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libm.so.6 \
perl"

inherit rpm
