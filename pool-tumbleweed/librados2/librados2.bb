SUMMARY = "RADOS distributed object store client library"
DESCRIPTION = "RADOS is a reliable, autonomic distributed object storage cluster \
developed as part of the Ceph distributed storage system. This is a \
shared library allowing applications to access the distributed object \
store using a simple file-like interface."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librados2-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "21043e2db23e8946431bd355955254608a99c900b1a015518dbdf311eb037352b124e3fe28a1130d5937b61f7e4c53a2c1daf562c7691d3a295051f91d195e02"

RPROVIDES:${PN} += "libceph-common.so.2()(64bit) \
librados.so.2()(64bit) \
librados.so.2(LIBRADOS_PRIVATE)(64bit) \
librados2 \
librados2(aarch-64) \
librados_tp.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libblkid.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libibverbs.so.1()(64bit) \
liblttng-ust.so.1()(64bit) \
libm.so.6()(64bit) \
librdmacm.so.1()(64bit) \
libresolv.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libz.so.1()(64bit)"

inherit rpm
