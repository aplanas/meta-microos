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

RPM_NAME = "libscamperctrl1-20230302-1.4.aarch64.rpm"
RPM_HASH = "52f7a255bb1b047bf4a83a195ba686e9dc0e4b89abc21a7fc9ba243bae224751923f6e6cf32071fd41305d7247a5f82ef7cb2c655074a004134ca2922a5e7bf9"

RPROVIDES:${PN} += "libscamperctrl.so.1 \
libscamperctrl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
