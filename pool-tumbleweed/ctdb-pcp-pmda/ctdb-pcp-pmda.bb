SUMMARY = "Performance Co-Pilot (PCP) monitoring agent"
DESCRIPTION = "The CTDB Performance Co-Pilot (PCP) monitoring agent allows remote PCP \
clients to view and capture detailed real-time performance metrics for \
one or more cluster nodes."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "ctdb-pcp-pmda-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "10c0129a4808ad3625ed0a02b77cb84ecb435b5bb825fd34381edb44b3e6c387e07aba49170fc79d3ef2d8469fdcc1724af37cd667c25523d9e7c592381a7b5a"

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
