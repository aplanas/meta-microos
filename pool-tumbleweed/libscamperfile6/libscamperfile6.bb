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

PV = "20230614b"

RPM_NAME = "libscamperfile6-20230614b-1.1.aarch64.rpm"
RPM_HASH = "f781306e427758d8c6c5e46dba856ac0c8b5a32ed9211f9c22c701c1c12f71971482fa09810e582ef088f355e2474a3694854663c7764f91280565e270749ed4"

RPROVIDES:${PN} += "libscamperfile.so.6 \
libscamperfile6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
