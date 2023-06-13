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

RPM_NAME = "dovecot23-devel-2.3.20-3.2.aarch64.rpm"
RPM_HASH = "767b1743e450f91dc7d5dc90d1df9294d26916a69224b514af2b9238f6140fc88016d3acc98e997d4b34fe7cbfe63f5de7a215bd65fab57c7ece3d6dba73c70e"

RPROVIDES:${PN} += "dovecot-devel \
dovecot23-devel \
dovecot23-devel(aarch-64)"

RDEPENDS:${PN} += "dovecot23"

inherit rpm
