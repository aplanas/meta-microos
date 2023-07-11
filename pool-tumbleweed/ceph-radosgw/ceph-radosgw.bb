SUMMARY = "Rados REST gateway"
DESCRIPTION = "RADOS is a distributed object store used by the Ceph distributed \
storage system.  This package provides a REST gateway to the \
object store that aims to implement a superset of Amazon's S3 \
service as well as the OpenStack Object Storage ('Swift') API."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-radosgw-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "84564f9b87d5a4392b5ca02c179373c3bd1c8320d3033ad2614f45198cedbf700a6858cbab27d44f68cf83a96fe328d5b5db983ffa836fb02c231090ee67176f"

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
