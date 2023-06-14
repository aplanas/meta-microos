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

PV = "2.1.5+20230320.22590c566"

RPM_NAME = "pacemaker-2.1.5+20230320.22590c566-1.1.aarch64.rpm"
RPM_HASH = "2dfa33014e83a4abb1dd5c24a711e31c129921063cb47b9b96f4c8c8b0f3feb94f9bb0fcf91e32a894a6eb9d5379c14c0f2cd7e7ed3e64e0a578be1f269775db"

RPROVIDES:${PN} += "pacemaker \
pacemaker-ticket-support"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/python3 \
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
