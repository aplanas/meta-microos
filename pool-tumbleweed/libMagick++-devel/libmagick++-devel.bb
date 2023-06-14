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

PV = "7.1.1.11"

RPM_NAME = "libMagick++-devel-7.1.1.11-1.1.aarch64.rpm"
RPM_HASH = "1f57f75a557c3ac5d849575a6aba887f1810cc768e520d57d68c46060b5a1432a277b3a6d1e6b20b607baa2e98f22d5ce211002f4fd95703b4725c55393cfefd"

RPROVIDES:${PN} += "libMagick++-devel \
pkgconfig-Magick++ \
pkgconfig-Magick++-7.Q16HDRI"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libMagick++-7-Q16HDRI5 \
libstdc++-devel \
pkgconfig-ImageMagick \
pkgconfig-MagickWand-7.Q16HDRI"

inherit rpm
