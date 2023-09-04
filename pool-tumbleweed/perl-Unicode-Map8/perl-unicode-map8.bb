SUMMARY = "Mapping table between 8-bit chars and Unicode"
DESCRIPTION = "The Unicode::Map8 class implements efficient mapping tables between \
8-bit character sets and 16-bit character sets like Unicode. The tables \
are efficient both in terms of space allocated and translation speed. \
The 16-bit strings are assumed to use network byte order."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.13"

RPM_NAME = "perl-Unicode-Map8-0.13-24.39.aarch64.rpm"
RPM_HASH = "6122c9d81209c2b1b3a3bb9ac2e5852e4fb85df607edf124a8b67460f35b2b183be14975becee39ae5034f443563e08027514215a0ae65e6fd8ef1e969df14d2"

RPROVIDES:${PN} += "perl-Unicode--Map8 \
perl-Unicode-Map8"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Unicode--String"

inherit rpm
