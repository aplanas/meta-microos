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

PV = "7.1.1.15"

RPM_NAME = "libMagickWand-7_Q16HDRI10-7.1.1.15-1.1.aarch64.rpm"
RPM_HASH = "efb55d89b85d00bf091d1e0e091b5a7ac9549926e4c8ef0028af7df45050c0b816ad1b84c9144ddebb4b80a35df735e3851aa8a6b3f58ef3836677cb297c6460"

RPROVIDES:${PN} += "libMagickWand-7-Q16HDRI10 \
libMagickWand-7.Q16HDRI.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libX11.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
