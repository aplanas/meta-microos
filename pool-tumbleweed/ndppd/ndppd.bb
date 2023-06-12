SUMMARY = "Neighbor Discovery Protocol Proxy Daemon"
DESCRIPTION = "ndppd is a daemon that proxies certain IPv6 NDP messages between two or more \
interfaces. It currently supports proxying Neighbor Solicitation Messages \
and Neighbor Advertisement messages in order to allow IPv6 routing without \
relying on Linux 'proxy_ndp'. \
 \
The daemon is partially compliant with (experimental) RFC4389."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.5.43"

RPM_NAME = "ndppd-0.2.5.43-4.8.aarch64.rpm"
RPM_HASH = "5804ca2f3fb7503dda71d4a800e94a5daff9074ea6d8c2afef8b5535a3cde9833add83320367aca405716c44e336f3c115194c326c345583fe33c0f452638756"

RPROVIDES:${PN} += "config(ndppd) \
ndppd \
ndppd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
systemd"

inherit rpm
