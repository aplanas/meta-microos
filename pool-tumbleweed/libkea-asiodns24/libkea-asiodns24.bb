SUMMARY = "Kea DHCP server asiolink abstraction layer library"
DESCRIPTION = "The asiodns library provides an abstraction layer between BIND10/Kea \
modules and the asiolink library."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-asiodns24-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "2d4a905bfcd72c941de3e577f761fac9a4d083211a15f9d8922939424528a9f443c1c06229c018be84e450c0f2c0864b555e54b98addf1b5760998bf0cd324ff"

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
