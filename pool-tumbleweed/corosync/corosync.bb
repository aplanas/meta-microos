SUMMARY = "The Corosync Cluster Engine and Application Programming Interfaces"
DESCRIPTION = "This package contains the Corosync Cluster Engine Executive, several default \
APIs and libraries, default configuration files, and an init script."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "corosync-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "acac8ae58cf14c43036b517537780572879af9835e0fbf93df6eb429effdd9e0e41ad88ee730788c0a3d8f61b1ba13db1be5d09f4225471bc5a4ca1a51775932"

RPROVIDES:${PN} += "config(corosync) \
corosync \
corosync(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcfg.so.6()(64bit) \
libcfg.so.6(COROSYNC_CFG_0.82)(64bit) \
libcfg6 \
libcmap.so.4()(64bit) \
libcmap.so.4(COROSYNC_CMAP_1.0)(64bit) \
libcmap4 \
libcorosync_common.so.4()(64bit) \
libcorosync_common4 \
libcpg.so.4()(64bit) \
libcpg.so.4(COROSYNC_CPG_1.0)(64bit) \
libcpg4 \
libqb.so.100()(64bit) \
libquorum.so.5()(64bit) \
libquorum.so.5(COROSYNC_QUORUM_1.0)(64bit) \
libquorum5 \
libsam4 \
libtotem_pg.so.5()(64bit) \
libtotem_pg5 \
libvotequorum.so.8()(64bit) \
libvotequorum.so.8(COROSYNC_VOTEQUORUM_1.0)(64bit) \
libvotequorum8 \
mozilla-nss-tools"

inherit rpm
