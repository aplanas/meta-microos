SUMMARY = "Ceph Metadata Server Daemon"
DESCRIPTION = "ceph-mds is the metadata server daemon for the Ceph distributed file system. \
One or more instances of ceph-mds collectively manage the file system \
namespace, coordinating access to the shared OSD cluster."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mds-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "e4c1f44fa300f0e3d5251d6fc05a31615150e68d8569a18bc5cc9fc053f8409a351003d5d950089643db4730d1426a9835ef29ef48353c5227b6f15cc9ca707d"

RPROVIDES:${PN} += "ceph-mds \
ceph-mds(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ceph-base \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libceph-common.so.2()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtcmalloc.so.4()(64bit)"

inherit rpm
