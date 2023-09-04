SUMMARY = "Ceph daemon for immutable object cache"
DESCRIPTION = "Daemon for immutable object cache."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-immutable-object-cache-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "ef1784d22ae9b7a55878bebaed7369966ee84ba27281890a6b2b0b0f50b9026fecd32b718fb63977c5d6aea7c1718c259c18a07749fb0f73c7084c72c7618741"

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
