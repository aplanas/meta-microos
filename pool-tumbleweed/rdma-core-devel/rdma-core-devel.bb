SUMMARY = "RDMA core development libraries and headers"
DESCRIPTION = "RDMA core development libraries and headers."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "rdma-core-devel-45.0-1.2.aarch64.rpm"
RPM_HASH = "a0e837749a24fb457b4ffefe2bbdac7f11b10e7bb781148e1a2ff8aeccb96ab36b86aec9135d07733037469f512192aba762a0526a6cfec382ca3e9ee8a2f98f"

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
