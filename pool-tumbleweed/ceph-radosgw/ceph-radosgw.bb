SUMMARY = "Rados REST gateway"
DESCRIPTION = "RADOS is a distributed object store used by the Ceph distributed \
storage system.  This package provides a REST gateway to the \
object store that aims to implement a superset of Amazon's S3 \
service as well as the OpenStack Object Storage ('Swift') API."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-radosgw-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "e3d5e017e7cf0f88e02e36c0a84abfc586b63b52dc0065f8c871918d13581b3363dd188583cdcbbc496d50a5f1a7ba5444ebdbc9294064b173345d637cbaa103"

RPROVIDES:${PN} += "ceph-radosgw \
libradosgw.so.2"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/env \
/usr/bin/sh \
ceph-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libicuuc.so.73 \
libldap.so.2 \
liblua5.4.so.5 \
libm.so.6 \
librados.so.2 \
librados2 \
librgw2 \
libssl.so.3 \
libstdc++.so.6 \
libtcmalloc.so.4"

inherit rpm
