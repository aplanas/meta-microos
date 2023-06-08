SUMMARY = "IMAP and POP3 Server Written Primarily with Security in Mind"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly. \
 \
This is a wrapper package that will just handle common things for all \
versioned dovecot packages."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.3"

RPM_NAME = "dovecot-2.3-6.5.noarch.rpm"
RPM_HASH = "269364990a109127f799c8920a121828005ec06a1cebbb6255de1cc3bad0419e4bb766c2981eb038436f8f7d204e0532986c027a175ddbfed95069d22092a0fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(dovecot) dovecot"
RDEPENDS:${PN} += "/bin/sh dovecot-implementation shadow"

inherit rpm
