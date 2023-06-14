SUMMARY = "Ceph distributed file system client library"
DESCRIPTION = "Ceph is a distributed network file system designed to provide excellent \
performance, reliability, and scalability. This is a shared library \
allowing applications to access a Ceph distributed file system via a \
POSIX-like interface."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "libcephfs2-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "6b0a68421f8fbfa31819dbc19549bc91bb8b37d9010dec23b15c655fd6d0f242f7f6b370f40e36ea616975eb5ae819d5fe3e80959f840f5894beacda701b5a19"

RPROVIDES:${PN} += "libcephfs.so.2 \
libcephfs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
