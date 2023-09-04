SUMMARY = "Development headers for scamper's control library"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains development headers and other ancillary files for the \
libscamperctrl library."
LICENSE = "GPL-2.0-only"

PV = "20230614b"

RPM_NAME = "libscamperctrl-devel-20230614b-1.1.aarch64.rpm"
RPM_HASH = "0ef80474d7a20292c9b50b477f06d17b16ccc3e3d8094e756344cd3bd8bb71dc1c88b327cc889a9d4c9c28f92aa9cf00278f08da440e80ec824fbadf5de63f81"

RPROVIDES:${PN} += "libscamperctrl-devel"

RDEPENDS:${PN} += "libscamperctrl2"

inherit rpm
