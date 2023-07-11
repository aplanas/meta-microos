SUMMARY = "Kea DHCP library"
DESCRIPTION = "libdhcp++ is an all-purpose DHCP-manipulation library, written in \
C++. It offers packet parsing and assembly, DHCPv4 and DHCPv6 options \
parsing and assembly, interface detection, and socket operations It \
can be used by server, client, relay, performance tools and other \
DHCP-related tools. For a server-specific library, see \
libkea-dhcpsrv."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-dhcp++54-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "62c20ce7f357ceb78b4c21bc5e900bd838bf9711f0b106e570aebde2307323b4317878ffabe0a93f26bb10535dc735f939fed05c759c6713fa381ddc40d31ccc"

RPROVIDES:${PN} += "libkea-dhcp++.so.54 \
libkea-dhcp++54"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-dns++.so.30 \
libkea-exceptions.so.13 \
libkea-hooks.so.57 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm
