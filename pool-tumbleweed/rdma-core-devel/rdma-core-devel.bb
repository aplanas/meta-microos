SUMMARY = "RDMA core development libraries and headers"
DESCRIPTION = "RDMA core development libraries and headers."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rdma-core-devel-47.0-3.1.aarch64.rpm"
RPM_HASH = "589fa3e171fc04a2ebeb2a7835e298d47251103059842ee4d5bf3b1737a7b7cf0dfe7d68267d3425dc286f71fdc57c2204edd62bcb8724f40b220927729946d9"

RPROVIDES:${PN} += "ibacm-devel \
infiniband-diags-devel \
libibmad-devel \
libibumad-devel \
libibverbs-devel \
librdmacm-devel \
pkgconfig-libefa \
pkgconfig-libibmad \
pkgconfig-libibnetdisc \
pkgconfig-libibumad \
pkgconfig-libibverbs \
pkgconfig-libmana \
pkgconfig-libmlx4 \
pkgconfig-libmlx5 \
pkgconfig-librdmacm \
rdma-core-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
infiniband-diags \
libefa1 \
libibumad3 \
libibverbs1 \
libmana1 \
libmlx4-1 \
libmlx5-1 \
librdmacm1 \
pkgconfig-libibmad \
pkgconfig-libibumad \
pkgconfig-libibverbs \
rdma-core \
rsocket"

inherit rpm
