SUMMARY = "Control library for scamper"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains thee library that provides functions to interact \
with a collection of scamper instances."
LICENSE = "GPL-2.0-only"

PV = "20230605"

RPM_NAME = "libscamperctrl2-20230605-1.1.aarch64.rpm"
RPM_HASH = "9f67c5b4d43cbe18b262617e57161346f050c1edf5c505ac739d1ad2cdbb9dac6fd54091308c161e58bbc556a18ee3aaaaaf6bcd409bf7f47ed967ef846530a1"

RPROVIDES:${PN} += "libscamperctrl.so.2 \
libscamperctrl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
