SUMMARY = "Fulltext search support via CLucene"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the files needed for fulltext search support via CLucene."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.3.20"

RPM_NAME = "dovecot23-fts-lucene-2.3.20-3.2.aarch64.rpm"
RPM_HASH = "eb7728cfd89d70991b7da2918ed7620c09c829c21236d62a9311ce6351d234270f3b7f397166fb201db45d7524417420e1dd86e5fe8fa1e4017a5daba98b6b46"

RPROVIDES:${PN} += "dovecot-fts-backend \
dovecot-fts-clucene \
dovecot23-fts-lucene \
lib20-doveadm-fts-lucene-plugin.so \
lib21-fts-lucene-plugin.so"

RDEPENDS:${PN} += "dovecot23 \
dovecot23-fts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclucene-core.so.1 \
libclucene-shared.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
