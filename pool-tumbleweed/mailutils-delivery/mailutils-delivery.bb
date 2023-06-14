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

RPM_NAME = "mailutils-delivery-3.16-1.2.aarch64.rpm"
RPM_HASH = "6c059b1d591a96041bb7bd17cf7da7c9bbf63d62f15a0213b31b87f169add41103d31370255d7988eecbbd71972bfeef8337a9b9d7dc84730f82c58f8c51d028"

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
