SUMMARY = "nftables firewalling command interface"
DESCRIPTION = "libnftables is the nftables command line interface placed into a \
library."
LICENSE = "GPL-2.0-only"

PV = "1.0.8"

RPM_NAME = "libnftables1-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "04557e4bae6ec82dd32ee9224e0c1319479d379f733016a6e9ae7928542cad7d3fafbab7028c0fa379f17a19051900ef18cd6c55a82fcf259164b4b4b35765b1"

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
