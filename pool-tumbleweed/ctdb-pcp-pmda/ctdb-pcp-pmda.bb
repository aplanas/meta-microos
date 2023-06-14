SUMMARY = "Performance Co-Pilot (PCP) monitoring agent"
DESCRIPTION = "The CTDB Performance Co-Pilot (PCP) monitoring agent allows remote PCP \
clients to view and capture detailed real-time performance metrics for \
one or more cluster nodes."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "ctdb-pcp-pmda-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "f20aed872bac51670cb282579e6bab7303f2f039760072d6e061ec62544777774edaf371405df8a3e5d3046a537ba3a320a77d9993e5db0eff844da2477c2c32"

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
