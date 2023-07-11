SUMMARY = "Command line tools for controlling Pacemaker clusters"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-cli package contains command line tools that can be used \
to query and control the cluster from machines that may, or may not, \
be part of the cluster."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.6+20230524.6fdc9deea"

RPM_NAME = "pacemaker-cli-2.1.6+20230524.6fdc9deea-1.1.aarch64.rpm"
RPM_HASH = "9654901796d8a3bd0a7a47d9f131c81b454d4f46f8633a8e8f117e4faabe6367c089143779dfb93ed394c3bfef7a353f694dddaf911a38e18f4260bc93948d65"

RPROVIDES:${PN} += "config-pacemaker-cli \
pacemaker-cli"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
