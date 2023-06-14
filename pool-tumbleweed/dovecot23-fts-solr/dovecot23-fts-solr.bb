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

RPM_NAME = "dovecot23-fts-solr-2.3.20-3.2.aarch64.rpm"
RPM_HASH = "ae7a85a69b8605951e268f44915f12acbbcbe66f047216bc6b41a9cc17fdc8cc5ea30f9464e918036d709e4b699a0d510b5c7ecd0624e240527b34259a54a9d0"

RPROVIDES:${PN} += "dovecot-fts-backend \
dovecot-fts-solr \
dovecot23-fts-solr \
lib21-fts-solr-plugin.so"

RDEPENDS:${PN} += "dovecot23 \
dovecot23-fts \
ld-linux-aarch64.so.1 \
lib20-fts-plugin.so \
libc.so.6 \
libexpat.so.1"

inherit rpm
