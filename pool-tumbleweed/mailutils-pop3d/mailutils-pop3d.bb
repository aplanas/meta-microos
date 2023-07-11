SUMMARY = "POP3 daemon from GNU Mailutils"
DESCRIPTION = "The 'pop3d' daemon implements the Post Office Protocol Version 3 server."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-pop3d-3.16-1.3.aarch64.rpm"
RPM_HASH = "508dcf64734150902cf9c4e7fc50560ec548b9b73daaa24ed69b4e1ef5d351affc71030f3b9ddb25c9a6fd01788d111f71ccdff52e4ca4dc10bbf904a822ac7a"

RPROVIDES:${PN} += "mailutils-pop3d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmailutils.so.9 \
libmu-auth.so.9 \
libmu-dbm.so.9 \
libmu-dotmail.so.9 \
libmu-maildir.so.9 \
libmu-mbox.so.9 \
libmu-mh.so.9 \
libmuaux.so.9 \
libunistring.so.5 \
libwrap.so.0"

inherit rpm
