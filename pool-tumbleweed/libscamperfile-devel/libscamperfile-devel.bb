SUMMARY = "Development headers for scamper's binary dump file access library"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains development headers and other ancillary files for the \
libscamperfile library."
LICENSE = "GPL-2.0-only"

PV = "20230605"

RPM_NAME = "libscamperfile-devel-20230605-1.1.aarch64.rpm"
RPM_HASH = "bb8b5c32d3f348dd2eef13cf74bff015b80cbfeca14ce8c9bbe42d947539ad1076d819f8d08713b5847499bdcb870e17a989673899b254e369b31bf5b0ace3b1"

RPROVIDES:${PN} += "libscamperfile-devel"

RDEPENDS:${PN} += "libscamperfile6"

inherit rpm
