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

PV = "7.1.1.15"

RPM_NAME = "libMagick++-7_Q16HDRI5-7.1.1.15-1.1.aarch64.rpm"
RPM_HASH = "f78a7335ff2ac0ef951bd68aaf1d3cedb7a508c7947f7006b7c7e9ee32e1e18a1334dc41dd9baff5ee9af45caf1bbd4adf75cdca148716c160479e1d61ad4a8e"

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
