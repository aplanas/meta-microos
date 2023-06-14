SUMMARY = "nftables firewalling command interface"
DESCRIPTION = "libnftables is the nftables command line interface placed into a \
library."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "libnftables1-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "91e528673c8f1fea932ec15c7b2cfe88edc11b251c1fcf99ac72e71a41d7d9e15e0bf4ff0bd2fbcbea9b361e94e4cc5c3268e208b523387f9e3a12729a3d79a5"

RPROVIDES:${PN} += "libnftables.so.1 \
libnftables1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libjansson.so.4 \
libmnl.so.0 \
libnftnl.so.11"

inherit rpm
