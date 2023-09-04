SUMMARY = "Perl interface for ImageMagick"
DESCRIPTION = "PerlMagick is an objected-oriented Perl interface to ImageMagick. Use \
the module to read, manipulate, or write an image or image sequence \
from within a Perl script. This makes it suitable for Web CGI scripts."
LICENSE = "ImageMagick"

PV = "7.1.1.15"

RPM_NAME = "perl-PerlMagick-7.1.1.15-1.1.aarch64.rpm"
RPM_HASH = "9f31bba9d0bc14eead6d75ce1959100866fccc0c0c2f174218d1cbd4f3d192bc02842f515ccf5517a9048f62f1cae8fd55203235203f9d0f4cf4e000f68d991b"

RPROVIDES:${PN} += "perl-Image--Magick \
perl-Image--Magick--Q16HDRI \
perl-PerlMagick"

RDEPENDS:${PN} += "ImageMagick \
ld-linux-aarch64.so.1 \
libMagickCore-7-Q16HDRI10 \
libMagickCore-7.Q16HDRI.so.10 \
libc.so.6 \
libm.so.6 \
perl"

inherit rpm
