SUMMARY = "Mapping table between 8-bit chars and Unicode"
DESCRIPTION = "The Unicode::Map8 class implements efficient mapping tables between \
8-bit character sets and 16-bit character sets like Unicode. The tables \
are efficient both in terms of space allocated and translation speed. \
The 16-bit strings are assumed to use network byte order."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.13"

RPM_NAME = "perl-Unicode-Map8-0.13-24.37.aarch64.rpm"
RPM_HASH = "e99e256fcb0e535fa5f9df15de01c9e2b7782b69efd819fa5b7ba7ffda7aeb387007e9031839fb24bae7365043d9f54dd05584f1ffa144861dc57dfe15467708"

RPROVIDES:${PN} += "perl(Unicode::Map8) \
perl-Unicode-Map8 \
perl-Unicode-Map8(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Unicode::String)"

inherit rpm
