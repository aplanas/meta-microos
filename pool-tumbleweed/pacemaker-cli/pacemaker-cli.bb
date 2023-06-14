SUMMARY = "Command line tools for controlling Pacemaker clusters"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-cli package contains command line tools that can be used \
to query and control the cluster from machines that may, or may not, \
be part of the cluster."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.5+20230320.22590c566"

RPM_NAME = "pacemaker-cli-2.1.5+20230320.22590c566-1.1.aarch64.rpm"
RPM_HASH = "aad5d2653889b326bc0007a9953dc41a7464a95e009d1782b5f5ac0644efd3ed6e53029de43758983e9d1701de1a137e69edde2228a09d821975aa3d40b32ccd"

RPROVIDES:${PN} += "config-pacemaker-cli \
pacemaker-cli"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcib.so.27 \
libcrmcommon.so.34 \
libcrmservice.so.28 \
libglib-2.0.so.0 \
liblrmd.so.28 \
libncurses.so.6 \
libpacemaker.so.1 \
libpe-rules.so.26 \
libpe-status.so.28 \
libqb.so.100 \
libstonithd.so.26 \
libtinfo.so.6 \
libxml2.so.2 \
logrotate \
pacemaker-libs \
perl-TimeDate \
procps \
psmisc"

inherit rpm
