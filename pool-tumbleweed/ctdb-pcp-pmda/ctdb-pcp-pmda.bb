SUMMARY = "Performance Co-Pilot (PCP) monitoring agent"
DESCRIPTION = "The CTDB Performance Co-Pilot (PCP) monitoring agent allows remote PCP \
clients to view and capture detailed real-time performance metrics for \
one or more cluster nodes."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "ctdb-pcp-pmda-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "0cd76e30b2dea187ad904687bc716373f37321ba3a09496df7f6d4950411a8ea10f40030dcb4181f425ecb5890f18e21a97dd44a08a295e199d4cd7217bf1b3e"

RPROVIDES:${PN} += "ctdb-pcp-pmda"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiov-buf-samba4.so \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpopt.so.0 \
libreplace-samba4.so \
libsamba-debug-samba4.so \
libsamba-util.so.0 \
libsocket-blocking-samba4.so \
libsys-rw-samba4.so \
libtalloc.so.2 \
libtdb-wrap-samba4.so \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-samba4.so"

inherit rpm
