SUMMARY = "Cluster synchronization tool"
DESCRIPTION = "Csync2 is a cluster synchronization tool. It can be used to keep files on \
multiple hosts in a cluster in sync. Csync2 can handle complex setups with \
much more than just 2 hosts, handle file deletions and can detect conflicts. \
It is expedient for HA-clusters, HPC-clusters, COWs and server farms."
LICENSE = "GPL-2.0-or-later"

PV = "2.0+git.1600444747.83b3644"

RPM_NAME = "csync2-2.0+git.1600444747.83b3644-1.10.aarch64.rpm"
RPM_HASH = "ed6a6276e7af99c93225a67590c6604d7aa95ad263f6f747fcfac5e07f55aabf585290236daa7324e6baa15266eedaf9d9b5783aa9883a0169ee079a89317cac"

RPROVIDES:${PN} += "config-csync2 \
csync2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
hostname \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
librsync.so.2 \
openssl \
sqlite3"

inherit rpm
