SUMMARY = "Console-based XMPP client"
DESCRIPTION = "Profanity is a-console based XMPP client written in C using ncurses, \
and inspired by Irssi. \
 \
This package holds the standard version. \
Including: \
 * Desktop notifications (OSD) \
 * Tray icon"
LICENSE = "SUSE-GPL-3.0+-with-openssl-exception"

PV = "0.13.1"

RPM_NAME = "profanity-standard-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "0ecb94c95e1d6e27d7c0ff61b6f06cfe191a22103854bf7373d56474645725f2585feafb87a98c9b60eb88f0dd894840e689c2a9cff999ccb037c50f8fe6ed95"

RPROVIDES:${PN} += "profanity-binary \
profanity-standard"

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
libgtk-x11-2.0.so.0 \
libm.so.6 \
libncursesw.so.6 \
libnotify.so.4 \
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
