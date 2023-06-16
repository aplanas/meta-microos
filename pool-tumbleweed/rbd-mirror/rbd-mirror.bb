SUMMARY = "Ceph daemon for mirroring RBD images"
DESCRIPTION = "Daemon for mirroring RBD images between Ceph clusters, streaming \
changes asynchronously."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "rbd-mirror-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "e3e6991f022adea5efd3b0fa1b0ed7cb13e0462cbc7f92330fb44a09398060fea01da56a28910bd6aaee214f0aecdae231d0d930a3b3c92d522326687e2975d3"

RPROVIDES:${PN} += "rbd-mirror"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcrypto.so.3 \
libcryptsetup.so.12 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
librbd1 \
libssl.so.3 \
libstdc++.so.6 \
libtcmalloc.so.4"

inherit rpm
