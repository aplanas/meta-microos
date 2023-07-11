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

RPM_NAME = "libMagickWand-7_Q16HDRI10-7.1.1.12-1.1.aarch64.rpm"
RPM_HASH = "8b1568576385d875904f6a363202bea1dd652d211b0a2ca6d6d79a73e4df8119b6cb16af01488766abc3144653541cd022e803acd0e89a2903e950d6d4625ad0"

RPROVIDES:${PN} += "libMagickWand-7-Q16HDRI10 \
libMagickWand-7.Q16HDRI.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
