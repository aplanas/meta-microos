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

PV = "20230302"

RPM_NAME = "libscamperctrl1-20230302-1.3.aarch64.rpm"
RPM_HASH = "812106a1fe4af54693c323c1cb658acd025287804aeb3c0e9fdaba3a0ec7b03037c756933f9f455982e4f736ad4bf1cb23d90ab406b16d8cb250db2c0505a9e2"

RPROVIDES:${PN} += "libscamperctrl.so.1()(64bit) \
libscamperctrl1 \
libscamperctrl1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
