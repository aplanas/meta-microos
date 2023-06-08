SUMMARY = "Fulltext search support via solr"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the files needed for fulltext search support via solr."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.3.20"

RPM_NAME = "dovecot23-fts-solr-2.3.20-3.1.aarch64.rpm"
RPM_HASH = "f27298f7acd68a05e93452a17d0049e596af906844427251c93ceee0abf5f460e018bffaa8948057be10ec53d5b9db73ac581871b9b4bd29b4e0bd8b59f78057"

RPROVIDES:${PN} += "dovecot-fts-solr dovecot23-fts-solr dovecot23-fts-solr(aarch-64) dovecot_fts_backend lib21_fts_solr_plugin.so()(64bit)"
RDEPENDS:${PN} += "dovecot23 dovecot23-fts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) lib20_fts_plugin.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libexpat.so.1()(64bit)"

inherit rpm
