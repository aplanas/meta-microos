SUMMARY = "Host reset daemon and client using sanlock"
DESCRIPTION = "The reset daemon and client for sanlock. \
A cooperating host running the daemon can be reset by a host \
running the client, so long as both maintain access to a \
common sanlock lockspace."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.8.5"

RPM_NAME = "sanlk-reset-3.8.5-1.4.aarch64.rpm"
RPM_HASH = "41e40fb674cc8b605c2fe9c142bd16d27206d1bfbe654c94354dd673462b10495e95648d94fe9f6ce7806e20bac6e134e7ebf43b2732e17182edb5f7c09476f9"

RPROVIDES:${PN} += "sanlk-reset"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsanlock.so.1 \
libsanlock1 \
libwdmd.so.1 \
sanlock"

inherit rpm
