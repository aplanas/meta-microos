SUMMARY = "Fast and correct UTF-8 IO"
DESCRIPTION = "This module provides a fast and correct UTF-8 PerlIO layer. Unlike perl's \
default ':utf8' layer it checks the input for correctness."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.010"

RPM_NAME = "perl-PerlIO-utf8_strict-0.010-1.4.aarch64.rpm"
RPM_HASH = "8b766f1176102db5e8edbc27a018897d343073ff4b19abf54fc493bfbd9d742600c84c3d257927f41730eb16f114c3326e2cecdd1a800583ae867b8d836a1118"

RPROVIDES:${PN} += "perl-PerlIO--utf8-strict \
perl-PerlIO-utf8-strict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
