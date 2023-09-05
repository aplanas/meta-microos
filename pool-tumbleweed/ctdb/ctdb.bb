SUMMARY = "Clustered TDB"
DESCRIPTION = "ctdb is the clustered database used by Samba"
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "ctdb-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "6d8ed6ffc33d62fa10b194f4d9e5864ac0e9eab1777d8229dd7d87775638b9bda8eec3322202fc117a9c267a669336cd62c7a40635c62d4faf72010ac2486449"

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
