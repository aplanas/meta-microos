SUMMARY = "Ceph daemon for mirroring RBD images"
DESCRIPTION = "Daemon for mirroring RBD images between Ceph clusters, streaming \
changes asynchronously."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "rbd-mirror-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "dc003077b26cba4db65b0c484e4a9a731952d543dac7756d8621bc9d24ae4d10da2fac110cc4822d59bf2d3b632f7f663898a14663d3fca3117cd46d491d04a8"

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
