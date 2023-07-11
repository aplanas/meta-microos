SUMMARY = "The Corosync Cluster Engine and Application Programming Interfaces"
DESCRIPTION = "This package contains the Corosync Cluster Engine Executive, several default \
APIs and libraries, default configuration files, and an init script."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "corosync-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "badf5d67639c784a4acf896487437b981bdb9140e472449d533c5a22d69d8633bf6564df071625ad680ca18c9fcee888097a1f7c22afd65e0632782ab971d25f"

RPROVIDES:${PN} += "config-corosync \
corosync"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfg.so.6 \
libcfg6 \
libcmap.so.4 \
libcmap4 \
libcorosync-common.so.4 \
libcorosync-common4 \
libcpg.so.4 \
libcpg4 \
libqb.so.100 \
libquorum.so.5 \
libquorum5 \
libsam4 \
libtotem-pg.so.5 \
libtotem-pg5 \
libvotequorum.so.8 \
libvotequorum8 \
mozilla-nss-tools"

inherit rpm
