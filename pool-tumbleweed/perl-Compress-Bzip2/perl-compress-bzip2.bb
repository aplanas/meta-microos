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

RPM_NAME = "perl-Compress-Bzip2-2.28-1.16.aarch64.rpm"
RPM_HASH = "5f12fa40123e41951145c53802fdc439284099a31a997bedb0182917ad04849f8ea79eecda42b96970c1d557c0724815e1e90e2484625d164d47f7b7d9ba0d4c"

RPROVIDES:${PN} += "perl-Compress--Bzip2 \
perl-Compress-Bzip2"

RDEPENDS:${PN} += "bzip2 \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
