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
profanity-standard \
profanity-standard(aarch-64)"

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
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libnotify.so.4()(64bit) \
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
