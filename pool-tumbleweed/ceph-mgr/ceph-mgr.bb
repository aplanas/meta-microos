SUMMARY = "Ceph Manager Daemon"
DESCRIPTION = "ceph-mgr enables python modules that provide services (such as the REST \
module derived from Calamari) and expose CLI hooks.  ceph-mgr gathers \
the cluster maps, the daemon metadata, and performance counters, and \
exposes all these to the python modules."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "af3e90e1c66875109c0212b697087f05cf87a89bbb1ca61fe2a7ee14e833935e1a816f15b13c91b29bc927ffdb4174fff715cf3c36b0c89a31b5fb9e2e910b6b"

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
libpython3.10.so.1.0 \
libstdc++.so.6 \
libtcmalloc.so.4"

inherit rpm
