SUMMARY = "Connection tracking daemon"
DESCRIPTION = "conntrackd is the user-space daemon for the Netfilter connection tracking \
system. This daemon synchronizes connection tracking states between several \
replica firewalls."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.7"

RPM_NAME = "conntrackd-1.4.7-1.3.aarch64.rpm"
RPM_HASH = "cfcfc6f45b94f021d2e485755feb7e9131456036f02a259328359a73d8133ff316095039365c6ab54c3b4acc8963db24ac450dfaabad6ecb6c6ab322f4382a20"

RPROVIDES:${PN} += "conntrack-tools:/usr/sbin/conntrackd \
conntrackd \
conntrackd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
conntrack-tools \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmnl.so.0()(64bit) \
libmnl.so.0(LIBMNL_1.0)(64bit) \
libnetfilter_conntrack.so.3()(64bit) \
libnetfilter_cthelper.so.0()(64bit) \
libnetfilter_cthelper.so.0(LIBNETFILTER_CTHELPER_1.0)(64bit) \
libnetfilter_queue.so.1()(64bit) \
libnfnetlink.so.0()(64bit) \
libnfnetlink.so.0(NFNETLINK_1.0.1)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
