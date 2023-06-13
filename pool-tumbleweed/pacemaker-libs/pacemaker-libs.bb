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

RPROVIDES:${PN} += "libcib.so.27()(64bit) \
libcrmcluster.so.29()(64bit) \
libcrmcommon.so.34()(64bit) \
libcrmservice.so.28()(64bit) \
liblrmd.so.28()(64bit) \
libpacemaker.so.1()(64bit) \
libpacemaker3 \
libpe_rules.so.26()(64bit) \
libpe_status.so.28()(64bit) \
libstonithd.so.26()(64bit) \
pacemaker-libs \
pacemaker-libs(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcmap.so.4()(64bit) \
libcorosync_common.so.4()(64bit) \
libcpg.so.4()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libglib-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libpils.so.2()(64bit) \
libqb.so.100()(64bit) \
libquorum.so.5()(64bit) \
libuuid.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
pacemaker-schemas \
shadow"

inherit rpm
