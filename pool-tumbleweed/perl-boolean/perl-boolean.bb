SUMMARY = "Boolean support for Perl"
DESCRIPTION = "Most programming languages have a native 'Boolean' data type. Perl does \
not. \
 \
Perl has a simple and well known Truth System. The following scalar values \
are false: \
 \
    $false1 = undef; \
    $false2 = 0; \
    $false3 = 0.0; \
    $false4 = ''; \
    $false5 = '0'; \
 \
Every other scalar value is true. \
 \
This module provides basic Boolean support, by defining two special \
objects: 'true' and 'false'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.46"

RPM_NAME = "perl-boolean-0.46-1.23.noarch.rpm"
RPM_HASH = "d0b79f04968d7a5cc9b6472df4df6ae4301156eab83105416fe362808615edfa53eebf912c5968e8defc28c1127f691e94a4429bebe60b6f0763e21b29b7f38b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(boolean) \
perl-boolean"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
