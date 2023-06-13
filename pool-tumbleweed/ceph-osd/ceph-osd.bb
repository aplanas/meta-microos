SUMMARY = "Ceph Object Storage Daemon"
DESCRIPTION = "ceph-osd is the object storage daemon for the Ceph distributed file \
system.  It is responsible for storing objects on a local file system \
and providing access to them over the network."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-osd-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "3870b86639ecc4db246beb5307bf2d2f6e953c329787bdfaaf39a9bbcaa15f1292af34f4c62cf6fb1e08c7dbf95b5c2deb23c1a1d56eee5752a1d44502be1609"

RPROVIDES:${PN} += "ceph-osd \
ceph-osd(aarch-64) \
ceph-test:/usr/bin/ceph-osdomap-tool \
config(ceph-osd)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ceph-base \
ld-linux-aarch64.so.1()(64bit) \
libaio.so.1()(64bit) \
libblkid.so.1()(64bit) \
libc.so.6()(64bit) \
libceph-common.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libfmt.so.9()(64bit) \
libfuse.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libibverbs.so.1()(64bit) \
libleveldb.so.1()(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
librdmacm.so.1()(64bit) \
libresolv.so.2()(64bit) \
libsnappy.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstoragemgmt \
libtcmalloc.so.4()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libz.so.1()(64bit) \
lvm2 \
python3-ceph-common \
sudo"

inherit rpm
