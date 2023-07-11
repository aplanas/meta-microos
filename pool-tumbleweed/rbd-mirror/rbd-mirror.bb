SUMMARY = "Ceph daemon for mirroring RBD images"
DESCRIPTION = "Daemon for mirroring RBD images between Ceph clusters, streaming \
changes asynchronously."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "rbd-mirror-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "9f72f3056beffd164ce29b1b683c9b08c2f5a18929c577deecf53895d3e4e37910bebface34b5c4b27ff4b5fbb0633bdf5bdc2f33158c10da8cb139b0d8a5d56"

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
