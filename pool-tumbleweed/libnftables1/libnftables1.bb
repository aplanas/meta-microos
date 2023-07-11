SUMMARY = "nftables firewalling command interface"
DESCRIPTION = "libnftables is the nftables command line interface placed into a \
library."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "libnftables1-1.0.7-1.7.aarch64.rpm"
RPM_HASH = "c71f68e960b5b627e390ba96c7bbc9a30540a0569786c5e2d0aa1d14f009bdbe3d2add6ebad1308e93397e824454e0b4f5c5560e01458eb745a79494b5059632"

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
