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
libctdb-event-client-samba4.so()(64bit)"

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
libc.so.6()(64bit) \
libgenrand-samba4.so()(64bit) \
libiov-buf-samba4.so()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libreplace-samba4.so()(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-util.so.0()(64bit) \
libsocket-blocking-samba4.so()(64bit) \
libsys-rw-samba4.so()(64bit) \
libtalloc-report-samba4.so()(64bit) \
libtalloc.so.2()(64bit) \
libtdb-wrap-samba4.so()(64bit) \
libtdb.so.1()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent.so.0()(64bit) \
libtime-basic-samba4.so()(64bit) \
libtirpc.so.3()(64bit) \
tdb-tools"

inherit rpm
