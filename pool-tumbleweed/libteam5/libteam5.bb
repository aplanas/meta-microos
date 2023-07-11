SUMMARY = "Library for controlling 802.1AX team network device"
DESCRIPTION = "A library which is the user-space counterpart for the team network \
driver, and provides an API to control them. \
 \
Linux kernel 3.3 and above offer a so-called 'team' network driver - \
a lightweight mechanism for bonding multiple interfaces together. \
It is a userspace-driven alternative to the existing bonding driver."
LICENSE = "LGPL-2.1-or-later"

PV = "1.31"

RPM_NAME = "libteam5-1.31-4.1.aarch64.rpm"
RPM_HASH = "0a57c71de3a6f1e29b4054b60a863465db77a75657b5d8657179f30a2c8aacdcdc404935d06fc99626fe0c2ba58b5d731545c5572ea7545a1ce8f45ec460a11e"

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
