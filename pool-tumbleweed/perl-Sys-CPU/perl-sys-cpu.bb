SUMMARY = "Perl extension for getting CPU information. Currently only number of CPU[cut]"
DESCRIPTION = "In responce to a post on perlmonks.org, a module for counting the number of \
CPU's on a system. Support has now also been added for type of CPU and \
clock speed. While much of the code is from UNIX::Processors, win32 support \
has been added (but not tested)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.61"

RPM_NAME = "perl-Sys-CPU-0.61-5.29.aarch64.rpm"
RPM_HASH = "f5c30d3f821f2bbef2e78a831d095337405d9611170499e6d54b07a1a30ff84031e99ac70966028f5b07f022a54c1754869960c6b6e8d6ae990dcae8d596ef7f"

RPROVIDES:${PN} += "perl-Sys--CPU \
perl-Sys-CPU"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
