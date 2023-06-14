SUMMARY = "POP3 daemon from GNU Mailutils"
DESCRIPTION = "The 'pop3d' daemon implements the Post Office Protocol Version 3 server."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-pop3d-3.16-1.2.aarch64.rpm"
RPM_HASH = "2affbca4348661b00964a302c62cfed3fd5880931c95d3987827caf874eb010aac29f2267927ab04a04f32b1f9de13d880bdfffc47ed512c76b2effe4928b26e"

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
