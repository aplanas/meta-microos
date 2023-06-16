SUMMARY = "Clustered TDB"
DESCRIPTION = "ctdb is the clustered database used by Samba"
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "ctdb-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "033c37fa98c7bef77b66bc1297be91546874c5c8a316ddddf339ebfcf4de0836a95bceda1ced0fc9a81178dfe68c1cf077a9c967dd4758ba81d854034f6f8927"

RPROVIDES:${PN} += "config-ctdb \
ctdb \
ctdb-tests \
libctdb-event-client-samba4.so"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/killall \
/usr/bin/mkdir \
/usr/bin/mktemp \
/usr/bin/sed \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenrand-samba4.so \
libiov-buf-samba4.so \
libpopt.so.0 \
libreplace-samba4.so \
libsamba-debug-samba4.so \
libsamba-util.so.0 \
libsocket-blocking-samba4.so \
libsys-rw-samba4.so \
libtalloc-report-samba4.so \
libtalloc.so.2 \
libtdb-wrap-samba4.so \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-samba4.so \
libtirpc.so.3 \
tdb-tools"

inherit rpm
