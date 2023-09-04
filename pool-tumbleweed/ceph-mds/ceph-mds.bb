SUMMARY = "Ceph Metadata Server Daemon"
DESCRIPTION = "ceph-mds is the metadata server daemon for the Ceph distributed file system. \
One or more instances of ceph-mds collectively manage the file system \
namespace, coordinating access to the shared OSD cluster."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mds-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "7940cbbcdb22b838ffce32ad32f73235c5daf44ee4c11c2196c506496deb2667edbc5662f5c7f3f02a2a0415fc7661085686226a1dad8aabd6f29ee5cf3fc242"

RPROVIDES:${PN} += "ceph-mds"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libfmt.so.9 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6 \
libtcmalloc.so.4"

inherit rpm
