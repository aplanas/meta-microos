SUMMARY = "Kea DHCP-DDNS service library"
DESCRIPTION = "This library provides DHCP-DDNS specific event loop and business logic."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-d2srv16-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "5fbfdeb5027d5d91219cbd8d60306e91e87e0324e7092a8f9774a5501c34bca72fade1ada00c8d253239fffc1a6ead75c164e7079437a255330fd6aab4d06e93"

RPROVIDES:${PN} += "libkea-d2srv.so.16()(64bit) \
libkea-d2srv16 \
libkea-d2srv16(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkea-asiodns.so.24()(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-cc.so.39()(64bit) \
libkea-dhcp_ddns.so.29()(64bit) \
libkea-dns++.so.30()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-hooks.so.57()(64bit) \
libkea-log.so.35()(64bit) \
libkea-process.so.40()(64bit) \
libkea-stats.so.18()(64bit) \
libkea-util.so.52()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
