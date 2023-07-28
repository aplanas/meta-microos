SUMMARY = "Kea DHCP library"
DESCRIPTION = "libdhcp++ is an all-purpose DHCP-manipulation library, written in \
C++. It offers packet parsing and assembly, DHCPv4 and DHCPv6 options \
parsing and assembly, interface detection, and socket operations It \
can be used by server, client, relay, performance tools and other \
DHCP-related tools. For a server-specific library, see \
libkea-dhcpsrv."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-dhcp++73-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "a7706e70f54051eda33b0d0208bbe738c669be148bb45b8a96e8192a4b9cc863c7c3ece4d4d3bde5900ad2c8c1e2cad009aba594ba2f5fa5f9d2278eda0fec0f"

RPROVIDES:${PN} += "libkea-dhcp++.so.73 \
libkea-dhcp++73"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-cc.so.54 \
libkea-dns++.so.42 \
libkea-exceptions.so.23 \
libkea-hooks.so.77 \
libkea-util.so.68 \
libstdc++.so.6"

inherit rpm
