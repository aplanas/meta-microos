SUMMARY = "Perl extension for accessing system CPU load averages"
DESCRIPTION = "Module for accessing System load averages."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.03"

RPM_NAME = "perl-Sys-LoadAvg-0.03-2.15.aarch64.rpm"
RPM_HASH = "19bdfe342578b83c3d99523a673c3cba4ee7183c5f53f81dbd0346ab13d350a898afd37820b20d6d2816fbfa04b3bb4666d4c767bd2501ea66fbb6b5c446a4fb"

RPROVIDES:${PN} += "perl-Sys--LoadAvg \
perl-Sys-LoadAvg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
