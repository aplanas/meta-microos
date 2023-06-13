SUMMARY = "convert English text to numbers"
DESCRIPTION = "This module converts English text into numbers. It supports both ordinal \
and cardinal numbers, negative numbers, and very large numbers. \
 \
The main subroutine, which is exported by default, is words2nums(). This \
subroutine, when fed a string, will attempt to convert it into a number. If \
it succeeds, the number will be returned. If it fails, it returns undef."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.18"

RPM_NAME = "perl-Lingua-EN-Words2Nums-0.18-1.26.noarch.rpm"
RPM_HASH = "e7d079f84677a4e9a56039ec84442b62b6b88436c0dcf5506864f1531f5b0d636e45c9afa90cdc93fa59a00761393e7bcd0c319846b7f6d4d515e676403e9ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Lingua::EN::Words2Nums) \
perl-Lingua-EN-Words2Nums"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
