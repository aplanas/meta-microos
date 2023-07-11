SUMMARY = "Ceph Manager Daemon"
DESCRIPTION = "ceph-mgr enables python modules that provide services (such as the REST \
module derived from Calamari) and expose CLI hooks.  ceph-mgr gathers \
the cluster maps, the daemon metadata, and performance counters, and \
exposes all these to the python modules."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "19f79e90cfcf3f4a34b584f2160467631a474d77a2489c6b52ffac693bc89300ee9039609ba8216a182cbd8ac28c360eab3de8df7e530be6e11b27efc30502d0"

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
