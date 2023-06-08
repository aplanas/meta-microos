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

RPM_NAME = "dovecot23-backend-pgsql-2.3.20-3.1.aarch64.rpm"
RPM_HASH = "9d0dd6585c2af489e6532452bcfcbebca9955b64c9a4b15327dea0381a7f06cab8f2f61f39cd2d1a2c0d19a93413ba61915859726348a160c425032c1889ecfa"

RPROVIDES:${PN} += "dovecot-backend-pgsql dovecot23-backend-pgsql dovecot23-backend-pgsql(aarch-64) dovecot_sql_backend libdriver_pgsql.so()(64bit)"
RDEPENDS:${PN} += "dovecot23 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit)"

inherit rpm
