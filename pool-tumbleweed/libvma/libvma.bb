SUMMARY = "A library for boosting TCP and UDP traffic (over RDMA hardware)"
DESCRIPTION = "VMA library is a performance booster of TCP and UDP traffic \
Part of Mellanox enhanced services \
Allows application written over standard socket API \
To run over Infiniband/Ethernet from userspace with full network stack bypass \
and get better throughput, latency and packets/sec rate"
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "9.7.0"

RPM_NAME = "libvma-9.7.0-2.1.aarch64.rpm"
RPM_HASH = "2d0bc629947c8086645d401eb9258d8c4f66eb3fa46fbaf1c506b83fcc89f7a50225af459d3e4c72f71db49ce4a09ed31a52a100b3917420ff2a01a8ede08a3f"

RPROVIDES:${PN} += "config-libvma \
libvma"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvma9"

inherit rpm
