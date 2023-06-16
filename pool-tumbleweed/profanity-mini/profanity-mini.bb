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
profanity-mini"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libm.so.6 \
libncursesw.so.6 \
libotr.so.5 \
libpython3.10.so.1.0 \
libreadline.so.8 \
libsignal-protocol-c.so.2 \
libsqlite3.so.0 \
libstrophe.so.0 \
libtinfo.so.6 \
profanity \
update-alternatives"

inherit rpm
