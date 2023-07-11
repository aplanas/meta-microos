SUMMARY = "Mapping table between 8-bit chars and Unicode"
DESCRIPTION = "The Unicode::Map8 class implements efficient mapping tables between \
8-bit character sets and 16-bit character sets like Unicode. The tables \
are efficient both in terms of space allocated and translation speed. \
The 16-bit strings are assumed to use network byte order."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.13"

RPM_NAME = "perl-Unicode-Map8-0.13-24.38.aarch64.rpm"
RPM_HASH = "20a8cd49a7f4dccd618b955bda54a0b138e379a070518ff816585c32858cbefa52c75f19813b99dd6c55a75f56dd9658c33857e35ab1b536336f0045c409e7b6"

RPROVIDES:${PN} += "perl-Unicode--Map8 \
perl-Unicode-Map8"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Unicode--String"

inherit rpm
