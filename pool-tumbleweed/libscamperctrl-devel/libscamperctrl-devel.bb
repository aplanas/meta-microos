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

PV = "20230605"

RPM_NAME = "libscamperctrl-devel-20230605-1.1.aarch64.rpm"
RPM_HASH = "c8335607d6967d7d815e4c81bb6157d4543c9eabec692aaaf244a38d907efc12fa47f825475fd7c3f356cbdd59263a16724cf8168eb42852c3804b45e2c1680a"

RPROVIDES:${PN} += "libscamperctrl-devel"

RDEPENDS:${PN} += "libscamperctrl2"

inherit rpm
