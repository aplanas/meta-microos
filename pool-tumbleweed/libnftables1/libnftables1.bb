SUMMARY = "nftables firewalling command interface"
DESCRIPTION = "libnftables is the nftables command line interface placed into a \
library."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "libnftables1-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "91e528673c8f1fea932ec15c7b2cfe88edc11b251c1fcf99ac72e71a41d7d9e15e0bf4ff0bd2fbcbea9b361e94e4cc5c3268e208b523387f9e3a12729a3d79a5"

RPROVIDES:${PN} += "libnftables.so.1()(64bit) \
libnftables.so.1(LIBNFTABLES_1)(64bit) \
libnftables.so.1(LIBNFTABLES_2)(64bit) \
libnftables.so.1(LIBNFTABLES_3)(64bit) \
libnftables1 \
libnftables1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libjansson.so.4()(64bit) \
libmnl.so.0()(64bit) \
libnftnl.so.11()(64bit) \
libnftnl.so.11(LIBNFTNL_11)(64bit) \
libnftnl.so.11(LIBNFTNL_13)(64bit) \
libnftnl.so.11(LIBNFTNL_14)(64bit) \
libnftnl.so.11(LIBNFTNL_15)(64bit) \
libnftnl.so.11(LIBNFTNL_16)(64bit)"

inherit rpm
