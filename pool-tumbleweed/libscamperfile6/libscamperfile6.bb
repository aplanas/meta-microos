SUMMARY = "File access library for scamper's binary dump format"
DESCRIPTION = "Scamper is a program that is able to conduct Internet measurement \
tasks to large numbers of IPv4 and IPv6 addresses, in parallel, to \
fill a specified packets-per-second rate. Currently, it supports the \
well-known ping and traceroute techniques, as well as MDA traceroute, \
alias resolution, some parts of tbit, sting, and neighbour discovery. \
 \
This package contains the library that provides access to the binary output \
files that scamper can produce in certain modes."
LICENSE = "GPL-2.0-only"

PV = "20230605"

RPM_NAME = "libscamperfile6-20230605-1.1.aarch64.rpm"
RPM_HASH = "b76309c2efba6190dbcc200545d069b99c564a2b187466b96fff5b109759a15a44fc193545470321f0cac2c09b788f59a04e18a9406c720891bcda960eab9f30"

RPROVIDES:${PN} += "libscamperfile.so.6 \
libscamperfile6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
