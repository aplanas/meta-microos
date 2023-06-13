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

RPM_NAME = "libMagickWand-7_Q16HDRI10-7.1.1.11-1.1.aarch64.rpm"
RPM_HASH = "ba90f5317a16a1dff5d13256acf856708927af4fd757c5db1148f56059e46f4150771c1fe93d26023c9b38d8c0dff723ea42f8bb7fe3de92bf59d41ab0f2fa41"

RPROVIDES:${PN} += "libMagickWand-7.Q16HDRI.so.10()(64bit) \
libMagickWand-7_Q16HDRI10 \
libMagickWand-7_Q16HDRI10(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libMagickCore-7.Q16HDRI.so.10()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
