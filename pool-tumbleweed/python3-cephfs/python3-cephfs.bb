SUMMARY = "Python 3 libraries for Ceph distributed file system"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph distributed \
file system."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-cephfs-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "e37c19d01c64a889810936d0485980457d1d4ccd010b9dd30a2d8cb022bc400e3bf5c815dd7abc6358a12f98644306a24051f3184e099efcfa4a9fb9a998e955"

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
