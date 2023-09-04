SUMMARY = "Development files for ImageMagick's C++ interface"
DESCRIPTION = "This is Magick++, the object-oriented C++ API for the ImageMagick \
image-processing library. \
 \
Magick++ supports an object model inspired by PerlMagick. Magick++ \
should be faster than PerlMagick since it is written in a compiled \
language which is not parsed at run-time. This makes it suitable for \
Web CGI programs. Images support implicit reference counting so that \
copy constructors and assignment incur almost no cost. The cost of \
actually copying an image (if necessary) is done just before \
modification and this copy is managed automatically by Magick++. \
De-referenced copies are automatically deleted. The image objects \
support value (rather than pointer) semantics so it is trivial to \
support multiple generations of an image in memory at one time."
LICENSE = "ImageMagick"

PV = "7.1.1.15"

RPM_NAME = "libMagick++-devel-7.1.1.15-1.1.aarch64.rpm"
RPM_HASH = "8ac4dec8cb02804536f733296638ee1e3b9cc983d904a7d5493ce0c2110ca6bc1bb79a508c66038154e71e814c57f86c175d22391e59100b6f454a32118ed181"

RPROVIDES:${PN} += "libMagick++-devel \
pkgconfig-Magick++ \
pkgconfig-Magick++-7.Q16HDRI"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libMagick++-7-Q16HDRI5 \
libstdc++-devel \
pkgconfig-ImageMagick \
pkgconfig-MagickWand-7.Q16HDRI"

inherit rpm
