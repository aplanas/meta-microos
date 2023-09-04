SUMMARY = "Very Fast Base to Base Conversion"
DESCRIPTION = "This module provides fast functions and methods to convert between \
arbitrary number bases from 2 (binary) thru 65535. \
 \
This module is pure Perl, has no external dependencies, and is backward \
compatible with old versions of Perl 5."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-Math-Base-Convert-0.11-2.25.noarch.rpm"
RPM_HASH = "a9a194bffff63ec89ba1da673a6b75a8564d26b1a0a9cb5d8125fc90f80f334b52524dcc4ca428947d03ff3019bcf22b3bff85a5c95a6910f2cf1407b9fc8a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--Base--Convert \
perl-Math--Base--Convert--Bases \
perl-Math--Base--Convert--Bitmaps \
perl-Math--Base--Convert--CalcPP \
perl-Math--Base--Convert--Shortcuts \
perl-Math-Base-Convert"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
