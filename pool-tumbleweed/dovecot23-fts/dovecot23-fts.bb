SUMMARY = "Fulltext search support base plugin"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the base plugin needed for fulltext search support"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.3.20"

RPM_NAME = "dovecot23-fts-2.3.20-3.2.aarch64.rpm"
RPM_HASH = "807c84a65fb9d47201c5244a2d7b6266e1cc8d84a9ea4dd8f0124aef22506d264a403948aa3076679796c9dbd0dde4190f773f8672f3da4c0d2eceacd2608cac"

RPROVIDES:${PN} += "dovecot23-fts \
dovecot23-fts(aarch-64) \
lib20_doveadm_fts_plugin.so()(64bit) \
lib20_fts_plugin.so()(64bit)"
RDEPENDS:${PN} += "dovecot23 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit)"

inherit rpm
