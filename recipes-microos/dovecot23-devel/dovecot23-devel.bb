SUMMARY = "Development files for Dovecot plugins"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This package holds the file needed to compile plugins outside of the \
dovecot tree."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.3.20"

RPM_NAME = "dovecot23-devel-2.3.20-3.1.aarch64.rpm"
RPM_HASH = "acc4c39090dc4537a92698dcd47ccaed3c962604a304a25621739ad3b897e45f159761f4398958d15fb5604ba8f25afd9c68558e30fe09c71525a28d449ee6e2"

RPROVIDES:${PN} += "dovecot-devel dovecot23-devel dovecot23-devel(aarch-64)"
RDEPENDS:${PN} += "dovecot23"

inherit rpm
