SUMMARY = "Perl extension to provide a PerlIO layer to gzip/gunzip"
DESCRIPTION = "PerlIO::gzip provides a PerlIO layer that manipulates files in the format \
used by the 'gzip' program. Compression and Decompression are implemented, \
but not together. If you attempt to open a file for reading and writing the \
open will fail."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.20"

RPM_NAME = "perl-PerlIO-gzip-0.20-1.24.aarch64.rpm"
RPM_HASH = "ff7a0068a80f0536adb56fbfabaeb52a6a0982674d98dc9cd661eb654def4c49f77d8fdaeac1907b8f5c77f1813d485852b87f7578454aa743d900d82c924229"

RPROVIDES:${PN} += "perl-PerlIO--gzip \
perl-PerlIO-gzip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
