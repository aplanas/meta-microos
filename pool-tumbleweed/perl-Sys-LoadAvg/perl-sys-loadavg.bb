SUMMARY = "Perl extension for accessing system CPU load averages"
DESCRIPTION = "Module for accessing System load averages."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-Sys-LoadAvg-0.03-2.13.aarch64.rpm"
RPM_HASH = "451fbd89970cde91a9b84aa28f4ad3fce84cb19127d00b2815a05284174f0b7f6da785849963422f54d643016680f242a5e72d7eaca2c031390ca2e3c4e95f51"

RPROVIDES:${PN} += "perl(Sys::LoadAvg) \
perl-Sys-LoadAvg \
perl-Sys-LoadAvg(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
