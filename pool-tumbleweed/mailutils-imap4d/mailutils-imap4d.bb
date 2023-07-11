SUMMARY = "IMAP4 daemon from GNU Mailutils"
DESCRIPTION = "GNU 'imap4d' is a daemon implementing IMAP4 rev1 protocol for accessing \
and handling electronic mail messages on a server."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-imap4d-3.16-1.3.aarch64.rpm"
RPM_HASH = "fa85edb6ca9d8038016bd1b2ba4a0a0cd3c920708ecf69c614c8736966c6f69c5baa8f1205cf2590f684fffd44f211ddd3df478cd2a74b3029f59420d9bc92cf"

RPROVIDES:${PN} += "mailutils-imap4d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsasl.so.7 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libmailutils.so.9 \
libmu-auth.so.9 \
libmu-dotmail.so.9 \
libmu-maildir.so.9 \
libmu-mbox.so.9 \
libmu-mh.so.9 \
libmuaux.so.9 \
libwrap.so.0"

inherit rpm
