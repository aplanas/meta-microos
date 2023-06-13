SUMMARY = "Console-based XMPP client"
DESCRIPTION = "Profanity is a console-based XMPP client written in C using ncurses, \
and inspired by Irssi. \
This package holds a minimal version, with most options not compiled \
in to have fewer dependencies. It is thus well suited for headless \
servers."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "0.13.1"

RPM_NAME = "profanity-mini-0.13.1-1.4.aarch64.rpm"
RPM_HASH = "8740f69fd7ecd3a3088550a467a4db3ed5a192676f2a21b56b1135427dbbcf00011eacf8ba246951e68ae2181733de57425c20ad7813f5be2d7b4e3b2fbec120"

RPROVIDES:${PN} += "profanity-binary \
profanity-mini \
profanity-mini(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libotr.so.5()(64bit) \
libpython3.10.so.1.0()(64bit) \
libreadline.so.8()(64bit) \
libsignal-protocol-c.so.2()(64bit) \
libsqlite3.so.0()(64bit) \
libstrophe.so.0()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
profanity \
update-alternatives"

inherit rpm
