SUMMARY = "Kea DHCP-DDNS service library"
DESCRIPTION = "This library provides DHCP-DDNS specific event loop and business logic."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-d2srv30-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "d589fa0ca59cb47e6945490a22177ea53f0fa470af7e14dbbf50d8e0704c257e718b22457b78264adac89324969258d046ba2214c75e70bbee9166b08fc66427"

RPROVIDES:${PN} += "libkea-d2srv.so.30 \
libkea-d2srv30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiodns.so.35 \
libkea-asiolink.so.56 \
libkea-cc.so.54 \
libkea-cfgclient.so.51 \
libkea-dhcp++.so.73 \
libkea-dhcp-ddns.so.41 \
libkea-dns++.so.42 \
libkea-exceptions.so.23 \
libkea-hooks.so.77 \
libkea-log.so.48 \
libkea-process.so.57 \
libkea-stats.so.29 \
libkea-util.so.68 \
libstdc++.so.6"

inherit rpm
