SUMMARY = "A library for spatial indexing"
DESCRIPTION = "libspatialindex provides a general framework for developing spatial indices. \
Currently it defines generic interfaces, provides simple main memory and disk \
based storage managers and a robust implementation of an R*-tree, an MVR-tree \
and a TPR-tree."
LICENSE = "MIT"

PV = "1.9.3"

RPM_NAME = "libspatialindex6-1.9.3-2.9.aarch64.rpm"
RPM_HASH = "9df41272f670f0d693b934a74522ec924b7c8f08a6d52c8e9a5b1e0fc0c36d303bad2d6b1454359ead32c79ab90b79ac89c1146e5cd88a53cdfe3b19b09d1aad"

RPROVIDES:${PN} += "libspatialindex.so.6()(64bit) \
libspatialindex6 \
libspatialindex6(aarch-64) \
libspatialindex_c.so.6()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
