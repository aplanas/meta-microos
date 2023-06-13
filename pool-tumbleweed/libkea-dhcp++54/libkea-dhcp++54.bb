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

RPROVIDES:${PN} += "libkea-dhcp++.so.54()(64bit) \
libkea-dhcp++54 \
libkea-dhcp++54(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-cc.so.39()(64bit) \
libkea-dns++.so.30()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-hooks.so.57()(64bit) \
libkea-util.so.52()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
