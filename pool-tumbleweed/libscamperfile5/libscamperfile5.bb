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

PV = "20230302"

RPM_NAME = "libscamperfile5-20230302-1.4.aarch64.rpm"
RPM_HASH = "8e40eba896889067c70107bac165f607fd915d9b66a639c054d89ea666ad967a015021dee3e041dec83c4109c384e697862f0d1b6504d3b0b88e4637675c5b16"

RPROVIDES:${PN} += "libscamperfile.so.5 \
libscamperfile5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
