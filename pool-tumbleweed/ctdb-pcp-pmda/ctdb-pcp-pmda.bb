SUMMARY = "Performance Co-Pilot (PCP) monitoring agent"
DESCRIPTION = "The CTDB Performance Co-Pilot (PCP) monitoring agent allows remote PCP \
clients to view and capture detailed real-time performance metrics for \
one or more cluster nodes."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "ctdb-pcp-pmda-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "cc77b591af56ca493aa437aa7bcc1cf66803fe6a7486f06c81fc8c828558de197027c1ce7d6f24c0e39398e4a3a510b7c769aec82f1c3d8525661bb0cedbbd80"

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
