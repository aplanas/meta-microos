SUMMARY = "Ceph RBD client base on NBD"
DESCRIPTION = "NBD based client to map Ceph rbd images to local device"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "rbd-nbd-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "3277d8399018780eec442138255be22ae5d2f6f6e8ca054f9b3e6d3cc32371441dae8ef8d6b54581d0253b21afe0210a599a2e916f503ae700aec81b91b2d90e"

RPROVIDES:${PN} += "rbd-nbd \
rbd-nbd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libceph-common.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
librados.so.2()(64bit) \
librados2 \
librbd.so.1()(64bit) \
librbd1 \
libstdc++.so.6()(64bit)"

inherit rpm
