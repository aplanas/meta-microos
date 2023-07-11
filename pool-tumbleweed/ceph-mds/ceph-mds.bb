SUMMARY = "Ceph Metadata Server Daemon"
DESCRIPTION = "ceph-mds is the metadata server daemon for the Ceph distributed file system. \
One or more instances of ceph-mds collectively manage the file system \
namespace, coordinating access to the shared OSD cluster."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mds-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "2f7c8b69780ea96a9e05ab0052b4d85d76fc882957da5328f63769e5531c8dfad5141cf9f5962f1b00eef8bcbaaf6579630a5e21b22713aa6200e39561321465"

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
