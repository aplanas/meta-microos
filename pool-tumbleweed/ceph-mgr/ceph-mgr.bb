SUMMARY = "Ceph Manager Daemon"
DESCRIPTION = "ceph-mgr enables python modules that provide services (such as the REST \
module derived from Calamari) and expose CLI hooks.  ceph-mgr gathers \
the cluster maps, the daemon metadata, and performance counters, and \
exposes all these to the python modules."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "64d19413f430d21cbf1647bc30791be843bee31355df9703e649774c0f6609e5a9307fdf62af8bcd66a8e32455930a05e9911a366f476a03395b8f762cf7455d"

RPROVIDES:${PN} += "ceph-mgr"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-base \
ceph-mgr-modules-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcephsqlite \
libfmt.so.9 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libtcmalloc.so.4"

inherit rpm
