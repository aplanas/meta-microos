SUMMARY = "Generalized mailbox access library"
DESCRIPTION = "At the core of Mailutils is 'libmailutils', a library which provides \
an API for accessing a generalized mailbox.  A set of complementary \
libraries provide methods for handling particular mailbox \
implementations: UNIX mailbox, Maildir, MH, POP3, IMAP4, even SMTP."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "libmailutils9-3.16-1.3.aarch64.rpm"
RPM_HASH = "09eddf3dd8b4551dcb46c7022446b6fd9d91815ab69fa37b561a8b018643a928cd10e12a5f45b4f17da0b608a14834dea3cc36f01f9e48e9aab274f46ea27ca3"

RPROVIDES:${PN} += "libmailutils.so.9 \
libmailutils9 \
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
libmuaux.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgcc-s.so.1 \
libgnutls.so.30 \
libgsasl.so.7 \
libguile-3.0.so.1 \
libkyotocabinet.so.16 \
liblber.so.2 \
libldap.so.2 \
libltdl.so.7 \
libpam.so.0 \
libpython3.11.so.1.0"

inherit rpm
