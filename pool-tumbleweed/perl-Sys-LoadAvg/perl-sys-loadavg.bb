SUMMARY = "Perl extension for accessing system CPU load averages"
DESCRIPTION = "Module for accessing System load averages."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-Sys-LoadAvg-0.03-2.14.aarch64.rpm"
RPM_HASH = "39245c196ee001c2a12a555172fa73047bb9c3b5716253b986387a25bb075c963fe15a4a1c8eb4c42e9b1847eaaf25c70936f9b3bb1b327ad9805ce0cf65011a"

RPROVIDES:${PN} += "perl-Sys--LoadAvg \
perl-Sys-LoadAvg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
