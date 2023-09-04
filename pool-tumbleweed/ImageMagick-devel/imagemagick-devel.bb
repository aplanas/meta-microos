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

PV = "7.1.1.15"

RPM_NAME = "ImageMagick-devel-7.1.1.15-1.1.aarch64.rpm"
RPM_HASH = "9009a2a0d40fd82cd8901d7fdd20edb802a02b38e5b193ae8c128d023cc6525668d0de7b643b38919fb879795a815feee3c94cbf3375145922e1eccd4c7bf07c"

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
