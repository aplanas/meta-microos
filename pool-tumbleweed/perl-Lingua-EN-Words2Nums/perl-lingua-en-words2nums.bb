SUMMARY = "convert English text to numbers"
DESCRIPTION = "This module converts English text into numbers. It supports both ordinal \
and cardinal numbers, negative numbers, and very large numbers. \
 \
The main subroutine, which is exported by default, is words2nums(). This \
subroutine, when fed a string, will attempt to convert it into a number. If \
it succeeds, the number will be returned. If it fails, it returns undef."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.18"

RPM_NAME = "perl-Lingua-EN-Words2Nums-0.18-1.28.noarch.rpm"
RPM_HASH = "856883cecdfe763a585d631b37e7857b165ad8d8158d53a983c28e45d61569a9c59b04336a5965fc483e6fd0073fe64271601aa36346f6e1e6e64aa27a059bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Words2Nums \
perl-Lingua-EN-Words2Nums"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
