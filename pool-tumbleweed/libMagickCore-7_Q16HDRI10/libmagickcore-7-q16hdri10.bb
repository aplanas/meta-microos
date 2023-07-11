SUMMARY = "C runtime library for ImageMagick"
DESCRIPTION = "ImageMagick is a robust collection of tools and libraries to read, \
write, and manipulate an image in many image formats, including popular \
formats like TIFF, JPEG, PNG, PDF, PhotoCD, and GIF. With ImageMagick, \
you can create images dynamically, making it suitable for Web \
applications. You can also resize, rotate, sharpen, color-reduce, or \
add special effects to an image and save your completed work in many \
different image formats. Image processing operations are available from \
the command line as well as through C, C++, and Perl-based programming \
interfaces."
LICENSE = "ImageMagick"

PV = "7.1.1.12"

RPM_NAME = "libMagickCore-7_Q16HDRI10-7.1.1.12-1.1.aarch64.rpm"
RPM_HASH = "e424368034dc68a68ea28ed2cd25aa42885be595cb591c5c707fe31a865b7861e992e8c0d23c402cfa1eec588bcbb25f83e923868c72d7d2d35c8bc292745c40"

RPROVIDES:${PN} += "libMagickCore-7-Q16HDRI10 \
libMagickCore-7.Q16HDRI.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
imagick-config-7 \
ld-linux-aarch64.so.1 \
libOpenEXR-3-1.so.30 \
libX11.so.6 \
libXext.so.6 \
libbz2.so.1 \
libc.so.6 \
libcairo.so.2 \
libfftw3.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libheif.so.1 \
libjbig.so.2 \
libjpeg.so.8 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
liblcms2.so.2 \
liblqr-1.so.0 \
libltdl.so.7 \
liblzma.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libraw-r.so.23 \
librsvg-2.so.2 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libxml2.so.2 \
libz.so.1"

inherit rpm
