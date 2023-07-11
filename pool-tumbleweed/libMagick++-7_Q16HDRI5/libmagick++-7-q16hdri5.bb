SUMMARY = "C++ interface runtime library for ImageMagick"
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

RPM_NAME = "libMagick++-7_Q16HDRI5-7.1.1.12-1.1.aarch64.rpm"
RPM_HASH = "c14804574e21084eba83d934be301908abe3616e99237e201c8c4b3593fbb2584fa4e408765ce14abde0a12b0249cd2f0b6fa9533dc985162e5a538f04957ccf"

RPROVIDES:${PN} += "libMagick++-7-Q16HDRI5 \
libMagick++-7.Q16HDRI.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ImageMagick \
ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libMagickWand-7.Q16HDRI.so.10 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
