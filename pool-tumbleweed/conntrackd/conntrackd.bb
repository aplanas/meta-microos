SUMMARY = "Connection tracking daemon"
DESCRIPTION = "conntrackd is the user-space daemon for the Netfilter connection tracking \
system. This daemon synchronizes connection tracking states between several \
replica firewalls."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.7"

RPM_NAME = "conntrackd-1.4.7-1.3.aarch64.rpm"
RPM_HASH = "cfcfc6f45b94f021d2e485755feb7e9131456036f02a259328359a73d8133ff316095039365c6ab54c3b4acc8963db24ac450dfaabad6ecb6c6ab322f4382a20"

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
