SUMMARY = "The Corosync Cluster Engine and Application Programming Interfaces"
DESCRIPTION = "This package contains the Corosync Cluster Engine Executive, several default \
APIs and libraries, default configuration files, and an init script."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "corosync-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "acac8ae58cf14c43036b517537780572879af9835e0fbf93df6eb429effdd9e0e41ad88ee730788c0a3d8f61b1ba13db1be5d09f4225471bc5a4ca1a51775932"

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
