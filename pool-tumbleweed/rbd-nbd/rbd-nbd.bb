SUMMARY = "Ceph RBD client base on NBD"
DESCRIPTION = "NBD based client to map Ceph rbd images to local device"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "rbd-nbd-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "02e60fb4edfe551777eeacf1c62aafdd1af9561c46761965949c6b15b489fa921ef41487aac8f86c5ccc7c1c4b406d50680c44735b280125bd0a2a8c092820f9"

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
