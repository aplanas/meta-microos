SUMMARY = "Clustered TDB"
DESCRIPTION = "ctdb is the clustered database used by Samba"
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "ctdb-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "2046e1b948842564099e948a36afe07101c412431ffbb1c16d422430e3c4955a347e944231a0c79edf7fba594f80157125f51795a7800558a535bbee8e28c44d"

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
