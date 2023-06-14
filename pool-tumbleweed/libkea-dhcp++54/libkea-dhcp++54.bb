SUMMARY = "Kea DHCP library"
DESCRIPTION = "libdhcp++ is an all-purpose DHCP-manipulation library, written in \
C++. It offers packet parsing and assembly, DHCPv4 and DHCPv6 options \
parsing and assembly, interface detection, and socket operations It \
can be used by server, client, relay, performance tools and other \
DHCP-related tools. For a server-specific library, see \
libkea-dhcpsrv."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-dhcp++54-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "0a3c7600ffd838da63865c66b345e481b5f85c6e3e54bf16f10f6051501c33ee2ff21eea37ebf810424bcbf6bd447d10b73286b8a17a1b8c2cfe2223e3aa8046"

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
