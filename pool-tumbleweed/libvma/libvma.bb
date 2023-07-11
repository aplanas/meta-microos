SUMMARY = "A library for boosting TCP and UDP traffic (over RDMA hardware)"
DESCRIPTION = "VMA library is a performance booster of TCP and UDP traffic \
Part of Mellanox enhanced services \
Allows application written over standard socket API \
To run over Infiniband/Ethernet from userspace with full network stack bypass \
and get better throughput, latency and packets/sec rate"
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "9.7.0"

RPM_NAME = "libvma-9.7.0-2.2.aarch64.rpm"
RPM_HASH = "09754f763d187f1e1cc42110faaf847add66473edbbc8a9f6a023e8150c52f8e070abea940c912a48125a544204bb3fa84b298ad929dddbfd5d1cc450deee0f3"

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
