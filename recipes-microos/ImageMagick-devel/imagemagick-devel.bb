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

PV = "7.1.1.8"

RPM_NAME = "ImageMagick-devel-7.1.1.8-1.1.aarch64.rpm"
RPM_HASH = "cee8bfe2ae53b64efd1345f938c00955b498c2f4bcdcb3a61b7fad065bded7468e15f5e42ec220c26136a357fa6182aed5f31a689a3f4c520e29b1cea019f96b"

RPROVIDES:${PN} += "ImageMagick-devel ImageMagick-devel(aarch-64) pkgconfig(ImageMagick) pkgconfig(ImageMagick-7.Q16HDRI) pkgconfig(MagickCore) pkgconfig(MagickCore-7.Q16HDRI) pkgconfig(MagickWand) pkgconfig(MagickWand-7.Q16HDRI)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config ImageMagick glibc-devel libMagickCore-7_Q16HDRI10 libMagickWand-7_Q16HDRI10 pkgconfig(MagickCore-7.Q16HDRI) pkgconfig(bzip2)"

inherit rpm
