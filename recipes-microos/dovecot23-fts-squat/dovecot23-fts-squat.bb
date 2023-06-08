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

RPM_NAME = "dovecot23-fts-squat-2.3.20-3.1.aarch64.rpm"
RPM_HASH = "3a644881803d0d98a94b7bdcbe4e4cb56541e79f48cf2acb61f1727662ad0b9574d4a9a1e37aede7fb51a10275d0e4f3c1382da6d78ed70bb7ba8143210b7e61"

RPROVIDES:${PN} += "dovecot23-fts-squat dovecot23-fts-squat(aarch-64) lib21_fts_squat_plugin.so()(64bit)"
RDEPENDS:${PN} += "dovecot23 dovecot23-fts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) lib20_fts_plugin.so()(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
