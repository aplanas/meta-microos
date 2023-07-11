SUMMARY = "Interface to Bzip2 compression library"
DESCRIPTION = "The _Compress::Bzip2_ module provides a Perl interface to the *bzip2* \
compression library (see AUTHOR for details about where to get _Bzip2_). A \
relevant subset of the functionality provided by _bzip2_ is available in \
_Compress::Bzip2_. \
 \
All string parameters can either be a scalar or a scalar reference. \
 \
The module can be split into two general areas of functionality, namely \
in-memory compression/decompression and read/write access to _bzip2_ files. \
Each of these areas will be discussed separately below. \
 \
*NOTE* \
 \
_Compress::Bzip2_ is just a simple _bzip2_ binding, comparable to the old \
Compress::Zlib library. It is not well integrated into PerlIO, use the \
preferred IO::Compress::Bzip2 instead."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.28"

RPM_NAME = "perl-Compress-Bzip2-2.28-1.17.aarch64.rpm"
RPM_HASH = "dd8dab985e38d310d02e18c128d86fb23be522ef114c8bc88c3ea64f2f043390b2ee62cffc7669d355473cedfd343701abf9ed43ed0003d6823a2f320bfcdab7"

RPROVIDES:${PN} += "perl-Compress--Bzip2 \
perl-Compress-Bzip2"

RDEPENDS:${PN} += "bzip2 \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
