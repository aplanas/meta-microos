SUMMARY = "Perl extension for getting CPU information. Currently only number of CPU[cut]"
DESCRIPTION = "In responce to a post on perlmonks.org, a module for counting the number of \
CPU's on a system. Support has now also been added for type of CPU and \
clock speed. While much of the code is from UNIX::Processors, win32 support \
has been added (but not tested)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.61"

RPM_NAME = "perl-Sys-CPU-0.61-5.28.aarch64.rpm"
RPM_HASH = "8524c02884c20aaf21455e14f640992d463b2a41cc78282dfeb6c81ab2c6d5994bd47cb5161145ea4d4046a27446c3b4adc4c6deec11469e31c79da89802c2d9"

RPROVIDES:${PN} += "perl-Sys--CPU \
perl-Sys-CPU"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
