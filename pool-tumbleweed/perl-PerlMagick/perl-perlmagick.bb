SUMMARY = "Perl interface for ImageMagick"
DESCRIPTION = "PerlMagick is an objected-oriented Perl interface to ImageMagick. Use \
the module to read, manipulate, or write an image or image sequence \
from within a Perl script. This makes it suitable for Web CGI scripts."
LICENSE = "ImageMagick"

PV = "7.1.1.12"

RPM_NAME = "perl-PerlMagick-7.1.1.12-1.1.aarch64.rpm"
RPM_HASH = "c4da6029597a28bc6faaa1311426f3624ab373cf427766598834a9f7cfaa113abd2a11b46dfe5b9a9cee8747a92c1cf83e03e4e5d23cd1b9e05dbc0702b20dd8"

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
