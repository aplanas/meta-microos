SUMMARY = "Perl extension to provide a PerlIO layer to gzip/gunzip"
DESCRIPTION = "PerlIO::gzip provides a PerlIO layer that manipulates files in the format \
used by the 'gzip' program. Compression and Decompression are implemented, \
but not together. If you attempt to open a file for reading and writing the \
open will fail."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.20"

RPM_NAME = "perl-PerlIO-gzip-0.20-1.22.aarch64.rpm"
RPM_HASH = "02c1b0a66d288b50d6946633ab7e0b15e4d4566c3e69feb29e1200c009465cea10e20d38b8d2eb2d3b748d3dc40aa0d90b0fc7f823515b59cabe6e60d00e1809"

RPROVIDES:${PN} += "perl(PerlIO::gzip) \
perl-PerlIO-gzip \
perl-PerlIO-gzip(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
