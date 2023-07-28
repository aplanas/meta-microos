SUMMARY = "Kea DHCP server asiolink abstraction layer library"
DESCRIPTION = "The asiodns library provides an abstraction layer between BIND10/Kea \
modules and the asiolink library."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-asiodns35-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "e8be8230b8887ca3a17a96246427a9a37aa619f94fa1a16912f2ca6c14bf096592de4e88b4b3b5f8c73d9383b0e9c24fb74d894b6adbaa6407857a8bb8b2ac97"

RPROVIDES:${PN} += "libkea-asiodns.so.35 \
libkea-asiodns35"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-dns++.so.42 \
libkea-exceptions.so.23 \
libkea-log.so.48 \
libstdc++.so.6"

inherit rpm
