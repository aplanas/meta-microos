SUMMARY = "Python 3 libraries for Ceph distributed file system"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph distributed \
file system."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-cephfs-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "d2c645bbb8cb2ac3576aad9a64c8a4552a4f34fb33024aa1028fcfcc9bbcd3b7bc8d0dbe17972597a8adbc050e4ef220559b57ab06c4cbf88919c9cafe466199"

RPROVIDES:${PN} += "python-cephfs \
python3-cephfs \
python3.10dist-cephfs \
python3dist-cephfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcephfs.so.2 \
libcephfs2 \
python-abi \
python3-ceph-argparse \
python3-rados"

inherit rpm
