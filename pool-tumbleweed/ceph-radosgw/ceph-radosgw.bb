SUMMARY = "Rados REST gateway"
DESCRIPTION = "RADOS is a distributed object store used by the Ceph distributed \
storage system.  This package provides a REST gateway to the \
object store that aims to implement a superset of Amazon's S3 \
service as well as the OpenStack Object Storage ('Swift') API."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-radosgw-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "4c7a034baf26727e176d416a780fc517dff2edb5bc458954e1e674e21c0c83260a7dccd89ba4093a52529c8d5627905dad53bae4c92c829665794fce23c39e56"

RPROVIDES:${PN} += "ceph-radosgw \
ceph-radosgw(aarch-64) \
libradosgw.so.2()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/awk \
/usr/bin/env \
ceph-base \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libceph-common.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libicuuc.so.73()(64bit) \
libldap.so.2()(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
librados.so.2()(64bit) \
librados2 \
librgw2 \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libtcmalloc.so.4()(64bit)"

inherit rpm
