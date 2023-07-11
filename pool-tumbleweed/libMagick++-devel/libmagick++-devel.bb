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

PV = "7.1.1.12"

RPM_NAME = "libMagick++-devel-7.1.1.12-1.1.aarch64.rpm"
RPM_HASH = "9035d6179d4493895a08a51cecb78b358a49dd931eecf21c5cc1d1180a5f4c7fb668e4b871e365bf33413fb01af419ff385a8fbf5ff987f0babdbb612cc461aa"

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
