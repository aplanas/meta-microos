SUMMARY = "Network Bandwidth Usage Monitor"
DESCRIPTION = "NetHogs is a small 'net top' tool. Instead of breaking the traffic down per \
protocol or per subnet, like most tools do, it groups bandwidth by process. \
NetHogs does not rely on a special kernel module to be loaded. If there's \
suddenly a lot of network traffic, you can fire up NetHogs and immediately see \
which PID is causing this. This makes it easy to indentify programs that have \
gone wild and are suddenly taking up your bandwidth."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.7"

RPM_NAME = "nethogs-0.8.7-1.6.aarch64.rpm"
RPM_HASH = "db0df1b5e7f73b7ec9e0f33c1d5d6068c7357b78180e8ea1818b51efb69f56673d1f2cd8fe1bb541b6a8a80f00f2d1c76fe8dabe2f74f9ba4757074e78980b87"

RPROVIDES:${PN} += "nethogs \
nethogs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libpcap.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
