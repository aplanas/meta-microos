SUMMARY = "SQLite support for Dovecot"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the files needed for SQLite support."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.3.20"

RPM_NAME = "dovecot23-backend-sqlite-2.3.20-3.2.aarch64.rpm"
RPM_HASH = "4741ceecc2a93553b5f765a862cd0625bf1525ba62cf54fb5b351215bbb760bdbaa8f719e066e44a07bf27a90d9821d3d3b512ced9adb8a1289063d1a42c376b"

RPROVIDES:${PN} += "dovecot-backend-sqlite dovecot23-backend-sqlite dovecot23-backend-sqlite(aarch-64) dovecot_sql_backend libdriver_sqlite.so()(64bit)"
RDEPENDS:${PN} += "dovecot23 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit)"

inherit rpm
