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

RPM_NAME = "libGraphicsMagick-Q16-3-1.3.40-2.3.aarch64.rpm"
RPM_HASH = "93e49704fc469a0df2bef450ccab472578e7ade2f7e79d6b60ffefbee7d20d3ca6a86924bcd64fd883759b1db16cd7b729ca7ac4e66d0006d4eaad33419055fc"

RPROVIDES:${PN} += "libGraphicsMagick-Q16-3 \
libGraphicsMagick-Q16-3(aarch-64) \
libGraphicsMagick-Q16.so.3()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGraphicsMagick3-config \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgomp.so.1()(64bit) \
libjbig.so.2()(64bit) \
libjpeg.so.8()(64bit) \
libjxl.so.0.8()(64bit) \
libjxl.so.0.8(JXL_0)(64bit) \
libjxl_threads.so.0.8()(64bit) \
libjxl_threads.so.0.8(JXL_0)(64bit) \
liblcms2.so.2()(64bit) \
libltdl.so.7()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
libwebpmux.so.3()(64bit) \
libwmflite-0.2.so.7()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
