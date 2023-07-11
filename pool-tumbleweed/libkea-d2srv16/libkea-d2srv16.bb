SUMMARY = "Kea DHCP-DDNS service library"
DESCRIPTION = "This library provides DHCP-DDNS specific event loop and business logic."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-d2srv16-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "75b4718d7bd96d182eb265c68e9463a98eafde71360736f6740bee4234b723851de9fd5a038ff6225bd6be880f71fb2e4cdf71cfc941a3aaf30244d144a12be0"

RPROVIDES:${PN} += "libkea-d2srv.so.16 \
libkea-d2srv16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiodns.so.24 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-dhcp-ddns.so.29 \
libkea-dns++.so.30 \
libkea-exceptions.so.13 \
libkea-hooks.so.57 \
libkea-log.so.35 \
libkea-process.so.40 \
libkea-stats.so.18 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm
