SUMMARY = "RADOS block device client library"
DESCRIPTION = "RBD is a block device striped across multiple distributed objects in \
RADOS, a reliable, autonomic distributed object storage cluster \
developed as part of the Ceph distributed storage system. This is a \
shared library allowing applications to manage these block devices."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librbd1-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "4c72d17ce3e32842db382752ed5ebe6df5ba5e627937271c42c971a234b04ca724701054987606282cc45cd82f745282a24f70bcb914fd55aae51b53a5c1b7ac"

RPROVIDES:${PN} += "libceph-librbd-parent-cache.so.1 \
libceph-librbd-pwl-cache.so.1 \
librbd-tp.so.1 \
librbd.so.1 \
librbd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
coreutils \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcrypto.so.3 \
libcryptsetup.so.12 \
libfmt.so.9 \
libgcc-s.so.1 \
liblttng-ust.so.1 \
librados.so.2 \
librados2 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
