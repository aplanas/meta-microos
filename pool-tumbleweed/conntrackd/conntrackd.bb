SUMMARY = "Connection tracking daemon"
DESCRIPTION = "conntrackd is the user-space daemon for the Netfilter connection tracking \
system. This daemon synchronizes connection tracking states between several \
replica firewalls."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.7"

RPM_NAME = "conntrackd-1.4.7-1.4.aarch64.rpm"
RPM_HASH = "e4cd2b318322ff47f117bfc79d899a8aa067422065b59054c6b1437792652ce03628ee62428da0df116f0d70e4f9a88a57f8cd4b147d424bea73d2f2c6e5cd20"

RPROVIDES:${PN} += "conntrack-tools-/usr/sbin/conntrackd \
conntrackd"

RDEPENDS:${PN} += "/usr/bin/sh \
conntrack-tools \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libnetfilter-conntrack.so.3 \
libnetfilter-cthelper.so.0 \
libnetfilter-queue.so.1 \
libnfnetlink.so.0 \
libsystemd.so.0"

inherit rpm
