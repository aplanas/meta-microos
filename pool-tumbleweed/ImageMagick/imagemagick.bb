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

PV = "7.1.1.15"

RPM_NAME = "ImageMagick-7.1.1.15-1.1.aarch64.rpm"
RPM_HASH = "11fe67fa761b19321b46ff3b82868f8f785199a60125163ea80b16af3378de146d2369ca361fcd1a2ce0ded76f29bdb8b84088def2669fa64cfb6329cabd86e3"

RPROVIDES:${PN} += "ImageMagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libc.so.6"

inherit rpm
