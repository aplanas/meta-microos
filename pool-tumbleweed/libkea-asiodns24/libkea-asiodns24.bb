SUMMARY = "Kea DHCP server asiolink abstraction layer library"
DESCRIPTION = "The asiodns library provides an abstraction layer between BIND10/Kea \
modules and the asiolink library."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-asiodns24-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "a4369587622c88a9267698ad50d738c29a850ac7193eacd54f3939d1fc7e2156591d5ec94259f77f20b4fe4c429ecdd7bcb6782c447e3e4ab52b2079fee42e74"

RPROVIDES:${PN} += "libkea-asiodns.so.24 \
libkea-asiodns24"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-dns++.so.30 \
libkea-exceptions.so.13 \
libkea-log.so.35 \
libstdc++.so.6"

inherit rpm
