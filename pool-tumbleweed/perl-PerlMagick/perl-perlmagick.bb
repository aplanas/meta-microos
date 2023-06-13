SUMMARY = "Perl interface for ImageMagick"
DESCRIPTION = "PerlMagick is an objected-oriented Perl interface to ImageMagick. Use \
the module to read, manipulate, or write an image or image sequence \
from within a Perl script. This makes it suitable for Web CGI scripts."
LICENSE = "ImageMagick"

PV = "7.1.1.11"

RPM_NAME = "perl-PerlMagick-7.1.1.11-1.1.aarch64.rpm"
RPM_HASH = "f3d189534f1afb3f3e65b7db8a8a5a22e48e388b280360926ddc5fee76e0821868e9e56f2b757471307279445fc12664f5a22ef98512c9f6d91129b85a2b3f85"

RPROVIDES:${PN} += "perl(Image::Magick) \
perl(Image::Magick::Q16HDRI) \
perl-PerlMagick \
perl-PerlMagick(aarch-64)"

RDEPENDS:${PN} += "ImageMagick \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libMagickCore-7.Q16HDRI.so.10()(64bit) \
libMagickCore-7_Q16HDRI10 \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
perl"

inherit rpm
