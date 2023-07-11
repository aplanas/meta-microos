SUMMARY = "Ceph daemon for immutable object cache"
DESCRIPTION = "Daemon for immutable object cache."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-immutable-object-cache-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "fbbfdbbeaf6bb2f4c6acfa45b413c4b80eff58302296692f71a416b4a81be3c022d86970cf790cbe9c09ded9844ea8c7c217e9553f2c125ebc55b67702c7d685"

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
