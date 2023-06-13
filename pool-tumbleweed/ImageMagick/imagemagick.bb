SUMMARY = "Viewer and Converter for Images"
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

RPM_NAME = "ImageMagick-7.1.1.11-1.1.aarch64.rpm"
RPM_HASH = "431603feb63834cba3f6b2aa43cf1952808e6c1ced8a24c5c0001fa2b1b6ce4e9ef9a9b7ba49fc0be08de3ab05e079f565075dbaea24fa05d6ad7aeaf3b6db21"

RPROVIDES:${PN} += "ImageMagick \
ImageMagick(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libMagickCore-7.Q16HDRI.so.10()(64bit) \
libMagickWand-7.Q16HDRI.so.10()(64bit) \
libc.so.6()(64bit)"

inherit rpm
