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

PV = "7.1.1.8"

RPM_NAME = "ImageMagick-7.1.1.8-1.1.aarch64.rpm"
RPM_HASH = "27313e443592fdc74af02f4329114ef1aa9290931eda5206a638c5491f92507d414a42f17ece20078920f35de6a223367a36b09efb8aa4fa4030574773aba24a"

RPROVIDES:${PN} += "ImageMagick ImageMagick(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMagickCore-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
