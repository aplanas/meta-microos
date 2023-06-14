SUMMARY = "Fast and correct UTF-8 IO"
DESCRIPTION = "This module provides a fast and correct UTF-8 PerlIO layer. Unlike perl's \
default ':utf8' layer it checks the input for correctness."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.010"

RPM_NAME = "perl-PerlIO-utf8_strict-0.010-1.3.aarch64.rpm"
RPM_HASH = "38eceeb5061bbf51b2a0d5911f161428f7d7eadcf8a8a9f4523e98a291906e5f4f6b789e3ef3dc3481ce81e162daee541e010993e66103348401e38eeddc2eb8"

RPROVIDES:${PN} += "perl-PerlIO--utf8-strict \
perl-PerlIO-utf8-strict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
