SUMMARY = "Clustered TDB"
DESCRIPTION = "ctdb is the clustered database used by Samba"
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "ctdb-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "2ff543b6d91b7dc335fa4315c22083d0218074dcdaed79d8769cf47a676cfb82a618e93313cae6a0e79fb4d94db1cd9db465dfbd32a21aa311a25d5495524b2b"

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
