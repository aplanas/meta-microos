SUMMARY = "The GraphicsMagick image conversion runtime library"
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

RPM_NAME = "libGraphicsMagick-Q16-3-1.3.40-2.4.aarch64.rpm"
RPM_HASH = "ab1bfae517442a343590eac2a4687502bef1e55327a7455d0f40bef27ef684c0c8d665af72ef284efb0497722576c56caf8bf6b245bb426f3d6a65f3d63e2e97"

RPROVIDES:${PN} += "libGraphicsMagick-Q16-3 \
libGraphicsMagick-Q16.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGraphicsMagick3-config \
libX11.so.6 \
libXext.so.6 \
libbz2.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgomp.so.1 \
libjbig.so.2 \
libjpeg.so.8 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
liblcms2.so.2 \
libltdl.so.7 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7 \
libwebpmux.so.3 \
libwmflite-0.2.so.7 \
libxml2.so.2 \
libz.so.1"

inherit rpm
