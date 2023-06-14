SUMMARY = "Kea DHCP-DDNS service library"
DESCRIPTION = "This library provides DHCP-DDNS specific event loop and business logic."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-d2srv16-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "5fbfdeb5027d5d91219cbd8d60306e91e87e0324e7092a8f9774a5501c34bca72fade1ada00c8d253239fffc1a6ead75c164e7079437a255330fd6aab4d06e93"

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
