SUMMARY = "Ceph distributed file system client library"
DESCRIPTION = "Ceph is a distributed network file system designed to provide excellent \
performance, reliability, and scalability. This is a shared library \
allowing applications to access a Ceph distributed file system via a \
POSIX-like interface."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephfs2-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "767143a0e975fe0f0cc1d6b7218a3d10356305207594953e33ce98ef0dd306b47bec0d9b3773251e7254471020c08557e3cc7ed559c2c26c43c27555c271deb7"

RPROVIDES:${PN} += "libcephfs.so.2 \
libcephfs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
