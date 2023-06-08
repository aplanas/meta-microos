SUMMARY = "Performance Co-Pilot (PCP) monitoring agent"
DESCRIPTION = "The CTDB Performance Co-Pilot (PCP) monitoring agent allows remote PCP \
clients to view and capture detailed real-time performance metrics for \
one or more cluster nodes."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "ctdb-pcp-pmda-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "f20aed872bac51670cb282579e6bab7303f2f039760072d6e061ec62544777774edaf371405df8a3e5d3046a537ba3a320a77d9993e5db0eff844da2477c2c32"

RPROVIDES:${PN} += "ctdb-pcp-pmda ctdb-pcp-pmda(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libiov-buf-samba4.so()(64bit) libiov-buf-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) libpcp.so.3()(64bit) libpcp.so.3(PCP_3.0)(64bit) libpcp.so.3(PCP_3.22)(64bit) libpcp_pmda.so.3()(64bit) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libreplace-samba4.so()(64bit) libreplace-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) libsamba-debug-samba4.so()(64bit) libsamba-debug-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) libsamba-util.so.0()(64bit) libsamba-util.so.0(SAMBA_UTIL_0.0.1)(64bit) libsocket-blocking-samba4.so()(64bit) libsocket-blocking-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) libsys-rw-samba4.so()(64bit) libsys-rw-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libtdb-wrap-samba4.so()(64bit) libtdb-wrap-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) libtdb.so.1()(64bit) libtdb.so.1(TDB_1.2.1)(64bit) libtdb.so.1(TDB_1.2.2)(64bit) libtdb.so.1(TDB_1.3.11)(64bit) libtevent-util.so.0()(64bit) libtevent-util.so.0(TEVENT_UTIL_0.0.1)(64bit) libtevent.so.0()(64bit) libtevent.so.0(TEVENT_0.9.13)(64bit) libtevent.so.0(TEVENT_0.9.14)(64bit) libtevent.so.0(TEVENT_0.9.21)(64bit) libtevent.so.0(TEVENT_0.9.9)(64bit) libtime-basic-samba4.so()(64bit) libtime-basic-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit)"

inherit rpm
