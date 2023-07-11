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

RPM_NAME = "dovecot-2.3-6.6.noarch.rpm"
RPM_HASH = "96cc1f7b201ab3fe7fcd9d5c6b80a41f6a318eb91fb0972438007ecddbd05aea8680780f421cca57589319ed2eb9af5efe91fe01ec75d8c020fa73ba136550ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dovecot \
dovecot"

RDEPENDS:${PN} += "/usr/bin/sh \
dovecot-implementation \
shadow"

inherit rpm
