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

RPROVIDES:${PN} += "dovecot-fts-clucene \
dovecot23-fts-lucene \
dovecot23-fts-lucene(aarch-64) \
dovecot_fts_backend \
lib20_doveadm_fts_lucene_plugin.so()(64bit) \
lib21_fts_lucene_plugin.so()(64bit)"
RDEPENDS:${PN} += "dovecot23 \
dovecot23-fts \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libclucene-core.so.1()(64bit) \
libclucene-shared.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
