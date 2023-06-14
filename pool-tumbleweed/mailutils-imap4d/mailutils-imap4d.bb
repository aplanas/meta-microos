SUMMARY = "IMAP4 daemon from GNU Mailutils"
DESCRIPTION = "GNU 'imap4d' is a daemon implementing IMAP4 rev1 protocol for accessing \
and handling electronic mail messages on a server."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-imap4d-3.16-1.2.aarch64.rpm"
RPM_HASH = "15679c1dd5a18d2b6220b7c9347a7ea1c2caecd27431cd1ce10735e73588633ada90861a379a518fd52bfc64ba8f5e60febe5c9fce4459a1721ce5ae5a3070ab"

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
