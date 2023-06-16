SUMMARY = "Ceph daemon for immutable object cache"
DESCRIPTION = "Daemon for immutable object cache."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-immutable-object-cache-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "f8ceb9212d8e09d761c85668a111f96aee17a0d3317824438e6a1794825bb48a18ae5681b41b70056c4b897bb491bc7d37b977b373b56b6ecc001c1447c29b98"

RPROVIDES:${PN} += "ceph-immutable-object-cache"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
libstdc++.so.6"

inherit rpm
