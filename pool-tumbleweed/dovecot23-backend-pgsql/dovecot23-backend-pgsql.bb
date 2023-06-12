SUMMARY = "PostgreSQL support for Dovecot"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the files needed for PostgreSQL support."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.3.20"

RPM_NAME = "dovecot23-backend-pgsql-2.3.20-3.2.aarch64.rpm"
RPM_HASH = "d9f7fd546f14a00ecc8cc1b31cddcf979352aabd6d9cf6294d7897036970c55094bd6bc4042270990e824a68cb056464a8d650dad838d1867cac211ef903bfbc"

RPROVIDES:${PN} += "dovecot-backend-pgsql \
dovecot23-backend-pgsql \
dovecot23-backend-pgsql(aarch-64) \
dovecot_sql_backend \
libdriver_pgsql.so()(64bit)"
RDEPENDS:${PN} += "dovecot23 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpq.so.5()(64bit)"

inherit rpm
