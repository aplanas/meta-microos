SUMMARY = "Library for controlling 802.1AX team network device"
DESCRIPTION = "A library which is the user-space counterpart for the team network \
driver, and provides an API to control them. \
 \
Linux kernel 3.3 and above offer a so-called 'team' network driver - \
a lightweight mechanism for bonding multiple interfaces together. \
It is a userspace-driven alternative to the existing bonding driver."
LICENSE = "LGPL-2.1+"

PV = "1.31"

RPM_NAME = "libteam5-1.31-3.8.aarch64.rpm"
RPM_HASH = "cf0a8ebe2369bc9c85385db99c5b86ffa0590e0d39e70c95a8e20d0af41eb9bc381e36466b6166bb51f134ae448662fabd3de296c01f28cb6459cef7cced7b2a"

RPROVIDES:${PN} += "libteam.so.5 \
libteam5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-cli-3.so.200 \
libnl-genl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
