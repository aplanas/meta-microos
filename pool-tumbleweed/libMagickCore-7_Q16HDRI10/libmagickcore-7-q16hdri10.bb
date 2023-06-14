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

PV = "7.1.1.11"

RPM_NAME = "libMagickCore-7_Q16HDRI10-7.1.1.11-1.1.aarch64.rpm"
RPM_HASH = "9e8c2fd9e938a29eb6b43500d363e168d3c52dbe0642ed871853e9a6eca3b0b4c27495272f03626afc6bb35a36b703e36754e5bedb04f28fb84c34d12c7d2e57"

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
