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

RPROVIDES:${PN} += "libvma.so.9()(64bit) \
libvma9 \
libvma9(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libibverbs.so.1()(64bit) \
libmlx5.so.1()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200()(64bit) \
libnl-route-3.so.200(libnl_3)(64bit) \
librdmacm.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
