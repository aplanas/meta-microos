SUMMARY = "Pacemaker remote executor daemon for non-cluster nodes"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-remote package contains the Pacemaker Remote daemon \
which is capable of extending pacemaker functionality to remote \
nodes not running the full corosync/cluster stack."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.6+20230524.6fdc9deea"

RPM_NAME = "pacemaker-remote-2.1.6+20230524.6fdc9deea-1.1.aarch64.rpm"
RPM_HASH = "994eaaf6b5afa5b62a1b7d66e5975240dac2e05db858f7d66d0542767e065baa2d4ce85593224d48be027a2c500eddafc42e3ddae661cb13b63012f86806bc3b"

RPROVIDES:${PN} += "pacemaker-remote"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrmcommon.so.34 \
libcrmservice.so.28 \
libglib-2.0.so.0 \
libgnutls.so.30 \
liblrmd.so.28 \
libqb.so.100 \
libstonithd.so.26 \
pacemaker-cli \
pacemaker-libs \
resource-agents \
systemd"

inherit rpm
