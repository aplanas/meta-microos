SUMMARY = "Library for controlling the team network device daemon"
DESCRIPTION = "Linux kernel 3.3 and above offer a so-called 'team' network driver - \
a lightweight mechanism for bonding multiple interfaces together. \
It is a userspace-driven alternative to the existing bonding driver."
LICENSE = "LGPL-2.1-or-later"

PV = "1.31"

RPM_NAME = "libteamdctl0-1.31-4.1.aarch64.rpm"
RPM_HASH = "de1937b2e72616a147ae7a790e5f982f8d8442e8c64377608ecb9243bbe31f8b4080e614fa9dd2a201bcf8b693c2a54f057a4eaf95b319df1ac4d9eb52504abe"

RPROVIDES:${PN} += "libteamdctl.so.0 \
libteamdctl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
