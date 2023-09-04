SUMMARY = "RDMA core development libraries and headers"
DESCRIPTION = "RDMA core development libraries and headers."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "rdma-core-devel-47.0-2.2.aarch64.rpm"
RPM_HASH = "5122116a7487122611409c98c951ad0b2733c4e0c24796395d26ee7a386332413b4048b85eefa5caebf8e00e8f89921e6a57bb28200e921d9855f3755927b0af"

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
