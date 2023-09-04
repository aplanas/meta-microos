SUMMARY = "Ceph RBD client base on NBD"
DESCRIPTION = "NBD based client to map Ceph rbd images to local device"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "rbd-nbd-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "2c0fd28bb9027f0cce08adebef47872a935d9d4550d3317d9b13c35ba631731d436d240e63e9f319260d29fa601c898501fea820198a2cb26266851bcbaa7d38"

RPROVIDES:${PN} += "rbd-nbd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
librados.so.2 \
librados2 \
librbd.so.1 \
librbd1 \
libstdc++.so.6"

inherit rpm
