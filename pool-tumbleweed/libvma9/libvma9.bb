SUMMARY = "Libvma runtime libary"
DESCRIPTION = "VMA library is a performance booster of TCP and UDP traffic \
Part of Mellanox enhanced services \
Allows application written over standard socket API \
To run over Infiniband/Ethernet from userspace with full network stack bypass \
and get better throughput, latency and packets/sec rate"
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "9.7.0"

RPM_NAME = "libvma9-9.7.0-2.2.aarch64.rpm"
RPM_HASH = "292a36e63c0d977f19a2455867ee48ed5bf23e8c7d3fbc30bfeec7c6e8d087a98753cb9dd25e7acbe8de4899b104db302f58b2ed3969cf67e6278d0da8ed21e7"

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
