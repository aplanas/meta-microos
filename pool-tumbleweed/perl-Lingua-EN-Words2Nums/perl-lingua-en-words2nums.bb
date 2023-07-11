SUMMARY = "convert English text to numbers"
DESCRIPTION = "This module converts English text into numbers. It supports both ordinal \
and cardinal numbers, negative numbers, and very large numbers. \
 \
The main subroutine, which is exported by default, is words2nums(). This \
subroutine, when fed a string, will attempt to convert it into a number. If \
it succeeds, the number will be returned. If it fails, it returns undef."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.18"

RPM_NAME = "perl-Lingua-EN-Words2Nums-0.18-1.27.noarch.rpm"
RPM_HASH = "0e77997f563ed124652bddb5ef95865aed9e1586bb6c917a32a4fa37217200c6be639010e35a7ada35e1033d67c5350d32e4b92fdff5f858f6b80ee89e93b718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Words2Nums \
perl-Lingua-EN-Words2Nums"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
