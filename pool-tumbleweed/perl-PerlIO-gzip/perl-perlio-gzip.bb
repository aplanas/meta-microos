SUMMARY = "Perl extension to provide a PerlIO layer to gzip/gunzip"
DESCRIPTION = "PerlIO::gzip provides a PerlIO layer that manipulates files in the format \
used by the 'gzip' program. Compression and Decompression are implemented, \
but not together. If you attempt to open a file for reading and writing the \
open will fail."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.20"

RPM_NAME = "perl-PerlIO-gzip-0.20-1.23.aarch64.rpm"
RPM_HASH = "224be4db670c646ab3c87a0a4b59ccd924dff2488c9a1189bd8a9568ec53451804bf2e1b98239a342554abd204f1987ed62266e188988fb9d38f2d47b9d1b9f1"

RPROVIDES:${PN} += "perl-PerlIO--gzip \
perl-PerlIO-gzip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
