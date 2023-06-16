SUMMARY = "Core Pacemaker libraries"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-libs package contains shared libraries needed for cluster \
nodes and those just running the CLI tools."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.5+20230320.22590c566"

RPM_NAME = "pacemaker-libs-2.1.5+20230320.22590c566-1.1.aarch64.rpm"
RPM_HASH = "2dcfc0a5d208df2952d9f5a6cdc15f1a66e2d5436518aab04f583a3fd893005f691f7c1b93a9fcb31a3bce78c612cd6be2aabca50c4c18c6a73604cbe4a4a2f9"

RPROVIDES:${PN} += "libcib.so.27 \
libcrmcluster.so.29 \
libcrmcommon.so.34 \
libcrmservice.so.28 \
liblrmd.so.28 \
libpacemaker.so.1 \
libpacemaker3 \
libpe-rules.so.26 \
libpe-status.so.28 \
libstonithd.so.26 \
pacemaker-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcmap.so.4 \
libcorosync-common.so.4 \
libcpg.so.4 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libpils.so.2 \
libqb.so.100 \
libquorum.so.5 \
libuuid.so.1 \
libxml2.so.2 \
libxslt.so.1 \
pacemaker-schemas \
shadow"

inherit rpm
