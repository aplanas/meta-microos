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

PV = "7.1.1.12"

RPM_NAME = "ImageMagick-7.1.1.12-1.1.aarch64.rpm"
RPM_HASH = "156ccde22da1bdf9652cb91948f2e2c93d349bc20cc62cce02026ac51c27f0747aca4e2e4e219954fc6195647cf7e7ddba1baa85b01633b2095ac863b33b4f9e"

RPROVIDES:${PN} += "ImageMagick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libc.so.6"

inherit rpm
