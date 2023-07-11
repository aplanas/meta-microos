SUMMARY = "Mailutils's delivery agents"
DESCRIPTION = "The name 'maidag' stands for Mail delivery agent.  It is a \
general-purpose MDA offering a number of features. It can operate \
both in traditional mode, reading a message from standard input, \
and in LMTP mode.  'Maidag' is able to deliver mail to any mailbox \
format supported by GNU Mailutils. These formats, among others, \
include 'smtp://', 'prog://' and 'sendmail://', which are equivalent to \
forwarding a message over SMTP to a remote node."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-delivery-3.16-1.3.aarch64.rpm"
RPM_HASH = "22d9a251f85661edd974eb45b6d136bb9df752dc9f51832901c9816e58dcfe3251f49629f07d1513caaa92a28f19bdc3166f83f158746a5bdbe662b9a512a82b"

RPROVIDES:${PN} += "mailutils-delivery"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libmailutils.so.9 \
libmu-auth.so.9 \
libmu-dbm.so.9 \
libmu-dotmail.so.9 \
libmu-imap.so.9 \
libmu-maildir.so.9 \
libmu-mailer.so.9 \
libmu-mbox.so.9 \
libmu-mh.so.9 \
libmu-pop.so.9 \
libmu-py.so.9 \
libmu-scm.so.9 \
libmu-sieve.so.9 \
libwrap.so.0"

inherit rpm
