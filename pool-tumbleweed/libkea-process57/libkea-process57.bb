SUMMARY = "Kea DHCP process abstraction library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-process57-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "a0509848b15b24aa10d0a8e9959ed87967f29a65c794beece59948e12f1e537ed2c35b0616dd1608b365952444b14f32f4dce4a3d2083bb987ed7900f39136e1"

RPROVIDES:${PN} += "libkea-process.so.57 \
libkea-process57"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-cc.so.54 \
libkea-cfgclient.so.51 \
libkea-database.so.48 \
libkea-exceptions.so.23 \
libkea-hooks.so.77 \
libkea-log.so.48 \
libkea-util.so.68 \
libstdc++.so.6"

inherit rpm
