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

RPM_NAME = "profanity-standard-0.13.1-1.4.aarch64.rpm"
RPM_HASH = "a66ba066ef6b8afa3851818bd44bca9cb992beea0b19903751c8b57bb8575f885593f0c052a73ebf026f76b9eb6538e13019c707ce4fb6038a5b728700d04f03"

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
libpython3.10.so.1.0 \
libreadline.so.8 \
libsignal-protocol-c.so.2 \
libsqlite3.so.0 \
libstrophe.so.0 \
libtinfo.so.6 \
profanity \
update-alternatives"

inherit rpm
