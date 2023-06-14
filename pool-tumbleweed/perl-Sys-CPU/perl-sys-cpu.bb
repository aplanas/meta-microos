SUMMARY = "Perl extension for getting CPU information. Currently only number of CPU[cut]"
DESCRIPTION = "In responce to a post on perlmonks.org, a module for counting the number of \
CPU's on a system. Support has now also been added for type of CPU and \
clock speed. While much of the code is from UNIX::Processors, win32 support \
has been added (but not tested)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.61"

RPM_NAME = "perl-Sys-CPU-0.61-5.27.aarch64.rpm"
RPM_HASH = "4f5f0440422bffed552a810ec2a8fab93421ff0d01264db02fbad4c54b00feca440f72d151b0eb0e00df036853a214d49fe983a6b80b2673d02da1c54bd08706"

RPROVIDES:${PN} += "perl-Sys--CPU \
perl-Sys-CPU"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
