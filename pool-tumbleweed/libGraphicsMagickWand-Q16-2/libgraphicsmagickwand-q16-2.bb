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

RPM_NAME = "libGraphicsMagickWand-Q16-2-1.3.40-2.4.aarch64.rpm"
RPM_HASH = "fa4a503315cc35983701434e3cd9717f7ac5ebd83dca0c24baaf90d4828fa1bf59036ff15a6e91665ae7eaffb4bcb11e7beb49e077bba4fa35a5f7c6c317c222"

RPROVIDES:${PN} += "libGraphicsMagickWand-Q16-2 \
libGraphicsMagickWand-Q16.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libm.so.6"

inherit rpm
