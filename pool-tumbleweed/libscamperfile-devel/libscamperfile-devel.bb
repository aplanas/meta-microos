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

PV = "20230302"

RPM_NAME = "libscamperfile-devel-20230302-1.4.aarch64.rpm"
RPM_HASH = "2db9f8cb797fdecdcd07a0d63cb13d71ec2f488c78818e0a61a371796a0b4533721ad7e7646acd2554a2168590b3463a6009767ddc30da816ce2d2f4f5206520"

RPROVIDES:${PN} += "libscamperfile-devel"

RDEPENDS:${PN} += "libscamperfile5"

inherit rpm
