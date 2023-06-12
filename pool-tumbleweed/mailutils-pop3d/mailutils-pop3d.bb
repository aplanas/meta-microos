SUMMARY = "POP3 daemon from GNU Mailutils"
DESCRIPTION = "The 'pop3d' daemon implements the Post Office Protocol Version 3 server."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.16"

RPM_NAME = "mailutils-pop3d-3.16-1.2.aarch64.rpm"
RPM_HASH = "2affbca4348661b00964a302c62cfed3fd5880931c95d3987827caf874eb010aac29f2267927ab04a04f32b1f9de13d880bdfffc47ed512c76b2effe4928b26e"

RPROVIDES:${PN} += "mailutils-pop3d \
mailutils-pop3d(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmailutils.so.9()(64bit) \
libmu_auth.so.9()(64bit) \
libmu_dbm.so.9()(64bit) \
libmu_dotmail.so.9()(64bit) \
libmu_maildir.so.9()(64bit) \
libmu_mbox.so.9()(64bit) \
libmu_mh.so.9()(64bit) \
libmuaux.so.9()(64bit) \
libunistring.so.5()(64bit) \
libwrap.so.0()(64bit)"

inherit rpm
