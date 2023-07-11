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

PV = "20230302"

RPM_NAME = "libscamperctrl-devel-20230302-1.4.aarch64.rpm"
RPM_HASH = "29e8c39ce290251d46f76c77325b153ed424989b21d080b76aa4a412fec209e3812707b153ccaa52e55cce1e2a25a0b8b0425eccff08925e21cded79e059eb50"

RPROVIDES:${PN} += "libscamperctrl-devel"

RDEPENDS:${PN} += "libscamperctrl1"

inherit rpm
