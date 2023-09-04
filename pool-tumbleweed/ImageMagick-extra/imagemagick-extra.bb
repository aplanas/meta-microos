SUMMARY = "Extra codecs for the ImageMagick image viewer/converter"
DESCRIPTION = "This package adds support for djvu, wmf and jpeg2000 formats and \
installs optional helper applications. \
 \
ImageMagick is a robust collection of tools and libraries to read, \
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

RPM_NAME = "ImageMagick-extra-7.1.1.15-1.1.aarch64.rpm"
RPM_HASH = "a36ba7b274e0471675779aed0bff1fa903859c9dbf5c9a6695c9d1b819aa5ff542e595438524a6c05061b68182916e324646e749a90da29e8dc0da74485dc6b4"

RPROVIDES:${PN} += "ImageMagick-extra"

RDEPENDS:${PN} += "ImageMagick \
ld-linux-aarch64.so.1 \
libMagickCore-7-Q16HDRI10 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libc.so.6 \
libdjvulibre.so.21 \
libm.so.6 \
libopenjp2.so.7 \
libwmflite-0.2.so.7"

inherit rpm
