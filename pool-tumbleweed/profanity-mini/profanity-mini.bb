SUMMARY = "Console-based XMPP client"
DESCRIPTION = "Profanity is a console-based XMPP client written in C using ncurses, \
and inspired by Irssi. \
This package holds a minimal version, with most options not compiled \
in to have fewer dependencies. It is thus well suited for headless \
servers."
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "0.14.0"

RPM_NAME = "profanity-mini-0.14.0-2.1.aarch64.rpm"
RPM_HASH = "03588770631c917110aea9f3049c873daaf4c2399c14924712d44da9a97e4da3e0a54a7c8ef2e74ce9b8be083f35887342eb911251eb691f5d900c39f33671e3"

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
libpython3.11.so.1.0 \
libreadline.so.8 \
libsignal-protocol-c.so.2 \
libsqlite3.so.0 \
libstrophe.so.0 \
libtinfo.so.6 \
profanity \
update-alternatives"

inherit rpm
