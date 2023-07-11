SUMMARY = "Development files for libxdp"
DESCRIPTION = "The libxdp-devel package contains headers used for building XDP programs using \
libxdp."
LICENSE = "GPL-2.0"

PV = "1.3.1"

RPM_NAME = "libxdp-devel-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "83bc7bb91dcb51902340c19b6ca1a48a739142b66f881a5e411a8605fea595d6121c1476c736d4744a4c7133d730ec2c81ae1667b3cc669e294fa79af8f66dd2"

RPROVIDES:${PN} += "libxdp-devel \
pkgconfig-libxdp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kernel-devel \
libxdp1 \
pkgconfig-libbpf"

inherit rpm
