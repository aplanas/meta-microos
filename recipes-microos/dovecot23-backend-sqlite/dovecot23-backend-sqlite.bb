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

RPM_NAME = "dovecot23-backend-sqlite-2.3.20-3.1.aarch64.rpm"
RPM_HASH = "d50682cc6531ccdfa3dc39595289021886a43bee202a36952e7e458c09149f7b19dcf4ce5dcba7f2534b01085a05010cac404b765bbc86acc26edaf0b0a0b54b"

RPROVIDES:${PN} += "dovecot-backend-sqlite dovecot23-backend-sqlite dovecot23-backend-sqlite(aarch-64) dovecot_sql_backend libdriver_sqlite.so()(64bit)"
RDEPENDS:${PN} += "dovecot23 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit)"

inherit rpm
