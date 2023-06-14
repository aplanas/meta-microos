SUMMARY = "Cluster synchronization tool"
DESCRIPTION = "Csync2 is a cluster synchronization tool. It can be used to keep files on \
multiple hosts in a cluster in sync. Csync2 can handle complex setups with \
much more than just 2 hosts, handle file deletions and can detect conflicts. \
It is expedient for HA-clusters, HPC-clusters, COWs and server farms."
LICENSE = "GPL-2.0-or-later"

PV = "2.0+git.1600444747.83b3644"

RPM_NAME = "csync2-2.0+git.1600444747.83b3644-1.9.aarch64.rpm"
RPM_HASH = "228ae93dfddae5cce7a0b3a00843a21fb89d9ae0cebc498efd4934472829d4a1386799bef4461aca7258d1d1e779c14082fe48c835f5c0c7838823f5a5164579"

RPROVIDES:${PN} += "config-csync2 \
csync2"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
hostname \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
librsync.so.2 \
openssl \
sqlite3"

inherit rpm
