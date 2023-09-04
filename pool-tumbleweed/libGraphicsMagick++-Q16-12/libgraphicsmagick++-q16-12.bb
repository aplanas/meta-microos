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

RPM_NAME = "libGraphicsMagick++-Q16-12-1.3.40-3.1.aarch64.rpm"
RPM_HASH = "45bbca96ba8b44adc8783f8e9bbd73fa9e55ac2edaaa802c852343513f44074d30279e391f9951973a3c931aad043700334efe12166d517baae6d96364fc74a7"

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
