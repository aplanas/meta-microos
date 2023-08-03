SUMMARY = "RDMA core development libraries and headers"
DESCRIPTION = "RDMA core development libraries and headers."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rdma-core-devel-47.0-1.1.aarch64.rpm"
RPM_HASH = "1ddf83b1d0996d43c53f8a16d0b27c22266c226c2c43b37294e182c303a730b557eb46beaac856fdaa3658766b6b7d69263a6800f0ab020aa0286547ae34959b"

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
