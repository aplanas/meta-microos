SUMMARY = "Python 3 libraries for Ceph distributed file system"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph distributed \
file system."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-cephfs-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "d60913f8ffcdab5ff2d918ef3bbabb9242a6c033dfdbf89672f2dc643408e64810db1bb4321ede3b94c09ef49506efd7747b913f94b7889ac78a8d88f071c2c5"

RPROVIDES:${PN} += "python-cephfs \
python3-cephfs \
python3.11dist-cephfs \
python3dist-cephfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcephfs.so.2 \
libcephfs2 \
python-abi \
python3-ceph-argparse \
python3-rados"

inherit rpm
