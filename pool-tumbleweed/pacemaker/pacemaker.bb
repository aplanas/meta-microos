SUMMARY = "Scalable High-Availability cluster resource manager"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
It supports more than 16 node clusters with significant capabilities \
for managing resources and dependencies. \
 \
It will run scripts at initialization, when machines go up or down, \
when related resources fail and can be configured to periodically check \
resource health."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.6+20230524.6fdc9deea"

RPM_NAME = "pacemaker-2.1.6+20230524.6fdc9deea-1.1.aarch64.rpm"
RPM_HASH = "576d97f9203938b65b3100a09531145730a555ece99112919105799580a5e5eea8ac493c2a25187bcc22e8f13c8dc00a8ee3a663f8e47c8f39da65a61b9b876b"

RPROVIDES:${PN} += "pacemaker \
pacemaker-ticket-support"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
corosync \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfg.so.6 \
libcib.so.27 \
libcmap.so.4 \
libcorosync-common.so.4 \
libcpg.so.4 \
libcrmcluster.so.29 \
libcrmcommon.so.34 \
libcrmservice.so.28 \
libglib-2.0.so.0 \
libgnutls.so.30 \
liblrmd.so.28 \
libpacemaker.so.1 \
libpam.so.0 \
libpe-rules.so.26 \
libpe-status.so.28 \
libqb.so.100 \
libstonithd.so.26 \
libxml2.so.2 \
pacemaker-cli \
pacemaker-libs \
python3 \
python3-pacemaker \
resource-agents \
systemd"

inherit rpm
