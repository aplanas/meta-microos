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

PV = "20230614b"

RPM_NAME = "libscamperfile-devel-20230614b-1.1.aarch64.rpm"
RPM_HASH = "776081f8d3acfaa8848759ef7ada1aaddbca2544f8d76296d1b1b4f527de50f9c5c11da8303565161bfde22fb670908308014508ed8a03cb664af590d421c3da"

RPROVIDES:${PN} += "libscamperfile-devel"

RDEPENDS:${PN} += "libscamperfile6"

inherit rpm
