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

RPM_NAME = "libGraphicsMagickWand-Q16-2-1.3.40-5.1.aarch64.rpm"
RPM_HASH = "de46bced08e75eb488c54ca314460f336244cd3be39934fbc7cec82ea812001d828864191c3cde107ea750b17057b1139dfc92c32aafae9bf6bbee9af972cdec"

RPROVIDES:${PN} += "libGraphicsMagickWand-Q16-2 \
libGraphicsMagickWand-Q16.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libm.so.6"

inherit rpm
