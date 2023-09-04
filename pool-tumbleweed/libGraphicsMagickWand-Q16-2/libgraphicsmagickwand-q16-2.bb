SUMMARY = "Runtime library for the GraphicsMagick image conversion library"
DESCRIPTION = "GraphicsMagick provides an image manipulation and translation utility \
and library. It can read and write over 88 image formats, including \
JPEG, TIFF, WMF, SVG, PNG, PNM, GIF, andPhoto CD. It also allows to \
resize, rotate, sharpen, color reduce, or add special effects to an \
image and to save the result to any supported format. GraphicsMagick \
may be used to create animated or transparent .gifs, to composite \
images, and to create thumbnail images. \
 \
This package is compiled with Q16, that means it provides better \
performance on 16 and less bit images."
LICENSE = "MIT"

PV = "1.3.40"

RPM_NAME = "libGraphicsMagickWand-Q16-2-1.3.40-3.1.aarch64.rpm"
RPM_HASH = "e39a522ea6439b68e5e2e6aa732d60278fb71ea350e4ce56e12443c0c04b29a4d2322f3021a1df6eb3aebd79f5ac17ec4a5e89b690eb09ab9673e90d9e963382"

RPROVIDES:${PN} += "libGraphicsMagickWand-Q16-2 \
libGraphicsMagickWand-Q16.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libm.so.6"

inherit rpm
