SUMMARY = "Development files for ImageMagick's C interface"
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

RPM_NAME = "ImageMagick-devel-7.1.1.12-1.1.aarch64.rpm"
RPM_HASH = "8e37b7eedc11e9977905a78443927096e29b9ac89ab86d1aff51b180a6780874aee1857343c64f3291e1a8e486f2123ffcf760c72ee90f00c90a99f4785c3248"

RPROVIDES:${PN} += "ImageMagick-devel \
pkgconfig-ImageMagick \
pkgconfig-ImageMagick-7.Q16HDRI \
pkgconfig-MagickCore \
pkgconfig-MagickCore-7.Q16HDRI \
pkgconfig-MagickWand \
pkgconfig-MagickWand-7.Q16HDRI"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ImageMagick \
glibc-devel \
libMagickCore-7-Q16HDRI10 \
libMagickWand-7-Q16HDRI10 \
pkgconfig-MagickCore-7.Q16HDRI \
pkgconfig-bzip2"

inherit rpm
