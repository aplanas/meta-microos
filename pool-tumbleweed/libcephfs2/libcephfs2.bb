SUMMARY = "Ceph distributed file system client library"
DESCRIPTION = "Ceph is a distributed network file system designed to provide excellent \
performance, reliability, and scalability. This is a shared library \
allowing applications to access a Ceph distributed file system via a \
POSIX-like interface."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephfs2-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "de9a76ce03656032443d15866feab89aded1d380d5b74228fbdd42ec498bc348fd063e61ffca42f0b974f1a586e1775c7f32cff959a269db8d2b441a4c750cdd"

RPROVIDES:${PN} += "libcephfs.so.2 \
libcephfs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
