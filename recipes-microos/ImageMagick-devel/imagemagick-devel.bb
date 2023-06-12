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

PV = "7.1.1.11"

RPM_NAME = "ImageMagick-devel-7.1.1.11-1.1.aarch64.rpm"
RPM_HASH = "9624275c8d0c9566af6254e9b3cc8c9ebf073b06f7e2c926c0b817fd24bb728ba534332e310fe5534ba73b2ad93c2d955a174ff45c98ab8d1cd00bb183acb921"

RPROVIDES:${PN} += "ImageMagick-devel \
ImageMagick-devel(aarch-64) \
pkgconfig(ImageMagick) \
pkgconfig(ImageMagick-7.Q16HDRI) \
pkgconfig(MagickCore) \
pkgconfig(MagickCore-7.Q16HDRI) \
pkgconfig(MagickWand) \
pkgconfig(MagickWand-7.Q16HDRI)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
ImageMagick \
glibc-devel \
libMagickCore-7_Q16HDRI10 \
libMagickWand-7_Q16HDRI10 \
pkgconfig(MagickCore-7.Q16HDRI) \
pkgconfig(bzip2)"

inherit rpm
