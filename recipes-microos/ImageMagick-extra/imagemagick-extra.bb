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

PV = "7.1.1.11"

RPM_NAME = "ImageMagick-extra-7.1.1.11-1.1.aarch64.rpm"
RPM_HASH = "b071a37f75eb0f4c5f0062bb8cc430a1f4188a1df1612d50c174a21d2869479b06e53d58ebb5a528d73dc45fc845b7fba0a2ee7337262406452f41840523820f"

RPROVIDES:${PN} += "ImageMagick-extra ImageMagick-extra(aarch-64)"
RDEPENDS:${PN} += "ImageMagick ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMagickCore-7.Q16HDRI.so.10()(64bit) libMagickCore-7_Q16HDRI10 libMagickWand-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdjvulibre.so.21()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libopenjp2.so.7()(64bit) libwmflite-0.2.so.7()(64bit)"

inherit rpm
