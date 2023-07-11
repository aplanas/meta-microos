SUMMARY = "Ceph Object Storage Daemon"
DESCRIPTION = "ceph-osd is the object storage daemon for the Ceph distributed file \
system.  It is responsible for storing objects on a local file system \
and providing access to them over the network."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-osd-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "bfc6a9fd9975ec90806209a26e34ca9b3dec10849f94e9249f9c8fccc3b51f872a6e6bfcad26649709a3ed5c22c8ccdd947cb55eb2c786f4a015eb4e5ffc67ae"

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
