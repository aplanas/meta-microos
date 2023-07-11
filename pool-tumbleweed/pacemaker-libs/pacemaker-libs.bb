SUMMARY = "Core Pacemaker libraries"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-libs package contains shared libraries needed for cluster \
nodes and those just running the CLI tools."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.6+20230524.6fdc9deea"

RPM_NAME = "pacemaker-libs-2.1.6+20230524.6fdc9deea-1.1.aarch64.rpm"
RPM_HASH = "79867a64692adf2a803a6c3372dfdea9aa61bcffca01aa4c038fa1eff5c679862f4bf09dbf2858911891a2720c7fff0cbca750a950fbea4b7d38070a2774049d"

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
