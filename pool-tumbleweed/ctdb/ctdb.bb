SUMMARY = "Clustered TDB"
DESCRIPTION = "ctdb is the clustered database used by Samba"
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "ctdb-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "033c37fa98c7bef77b66bc1297be91546874c5c8a316ddddf339ebfcf4de0836a95bceda1ced0fc9a81178dfe68c1cf077a9c967dd4758ba81d854034f6f8927"

RPROVIDES:${PN} += "config(ctdb) \
ctdb \
ctdb(aarch-64) \
ctdb-tests \
libctdb-event-client-samba4.so()(64bit) \
libctdb-event-client-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit)"

RDEPENDS:${PN} += "/bin/mktemp \
/bin/sh \
/usr/bin/env \
/usr/bin/killall \
/usr/bin/mkdir \
/usr/bin/sed \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgenrand-samba4.so()(64bit) \
libgenrand-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libiov-buf-samba4.so()(64bit) \
libiov-buf-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libreplace-samba4.so()(64bit) \
libreplace-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-debug-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsamba-util.so.0()(64bit) \
libsamba-util.so.0(SAMBA_UTIL_0.0.1)(64bit) \
libsocket-blocking-samba4.so()(64bit) \
libsocket-blocking-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libsys-rw-samba4.so()(64bit) \
libsys-rw-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libtalloc-report-samba4.so()(64bit) \
libtalloc-report-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libtalloc.so.2(TALLOC_2.1.0)(64bit) \
libtdb-wrap-samba4.so()(64bit) \
libtdb-wrap-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libtdb.so.1()(64bit) \
libtdb.so.1(TDB_1.2.1)(64bit) \
libtdb.so.1(TDB_1.2.10)(64bit) \
libtdb.so.1(TDB_1.2.2)(64bit) \
libtdb.so.1(TDB_1.2.5)(64bit) \
libtdb.so.1(TDB_1.3.0)(64bit) \
libtdb.so.1(TDB_1.3.11)(64bit) \
libtevent-util.so.0()(64bit) \
libtevent-util.so.0(TEVENT_UTIL_0.0.1)(64bit) \
libtevent.so.0()(64bit) \
libtevent.so.0(TEVENT_0.9.13)(64bit) \
libtevent.so.0(TEVENT_0.9.14)(64bit) \
libtevent.so.0(TEVENT_0.9.16)(64bit) \
libtevent.so.0(TEVENT_0.9.21)(64bit) \
libtevent.so.0(TEVENT_0.9.9)(64bit) \
libtime-basic-samba4.so()(64bit) \
libtime-basic-samba4.so(SAMBA_4.18.1_GIT.298.4CCF830B2A41.1_SUSE_OS15.9_AARCH64_SAMBA4)(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.0)(64bit) \
tdb-tools"

inherit rpm
