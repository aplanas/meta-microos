SUMMARY = "Libvma runtime libary"
DESCRIPTION = "VMA library is a performance booster of TCP and UDP traffic \
Part of Mellanox enhanced services \
Allows application written over standard socket API \
To run over Infiniband/Ethernet from userspace with full network stack bypass \
and get better throughput, latency and packets/sec rate"
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "9.7.0"

RPM_NAME = "libvma9-9.7.0-2.1.aarch64.rpm"
RPM_HASH = "e26d6a7a291d6a058f79e96f3797de7db001379adae19b6810b65df41f858d6ed7aa09e4791c3b91700c3679f5c83acb3357a289e33b9e324272aa085f565acc"

RPROVIDES:${PN} += "libvma.so.9 \
libvma9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libibverbs.so.1 \
libmlx5.so.1 \
libnl-3.so.200 \
libnl-route-3.so.200 \
librdmacm.so.1 \
libstdc++.so.6"

inherit rpm
