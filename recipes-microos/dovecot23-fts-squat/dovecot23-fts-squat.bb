SUMMARY = "Fulltext search support squat plugin"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the files needed for fulltext search support squat plugin."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.3.20"

RPM_NAME = "dovecot23-fts-squat-2.3.20-3.2.aarch64.rpm"
RPM_HASH = "23184393644f85d3f60eb74ddb9975672941883ac9fc54ac721f75a86b248ea72dccaa4780e158276d426cdef1c4a6797ecdfecbb9c53f1e5ee174a5bb0e2395"

RPROVIDES:${PN} += "dovecot23-fts-squat dovecot23-fts-squat(aarch-64) lib21_fts_squat_plugin.so()(64bit)"
RDEPENDS:${PN} += "dovecot23 dovecot23-fts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) lib20_fts_plugin.so()(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
