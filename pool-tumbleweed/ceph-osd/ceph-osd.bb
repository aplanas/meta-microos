SUMMARY = "Ceph Object Storage Daemon"
DESCRIPTION = "ceph-osd is the object storage daemon for the Ceph distributed file \
system.  It is responsible for storing objects on a local file system \
and providing access to them over the network."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-osd-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "5ca232aa39f549e71986e0f4edbfb7f1fd28aab4ae8d99e76c6cc376880dd09848a9c36bf52215a3fb4a3e454f6dbb14c18f2e25ad66e829e7d622d3fb63da68"

RPROVIDES:${PN} += "ceph-osd \
ceph-test-/usr/bin/ceph-osdomap-tool \
config-ceph-osd"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ceph-base \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcrypto.so.3 \
libfmt.so.9 \
libfuse.so.2 \
libgcc-s.so.1 \
libibverbs.so.1 \
libleveldb.so.1 \
liblz4.so.1 \
libm.so.6 \
librdmacm.so.1 \
libresolv.so.2 \
libsnappy.so.1 \
libstdc++.so.6 \
libstoragemgmt \
libtcmalloc.so.4 \
libudev.so.1 \
libz.so.1 \
lvm2 \
python3-ceph-common \
sudo"

inherit rpm
