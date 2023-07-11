SUMMARY = "IRC to other Chat Networks Gateway"
DESCRIPTION = "BitlBee is a gateway between instant messaging and an IRC client. \
With it, one's IRC client program can be reused and no extra IM program \
will need to run. \
 \
This package comes with support for MSN, Jabber, Oscar and Yahoo, as well as \
enabled flood protection."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "bitlbee-3.6-4.5.aarch64.rpm"
RPM_HASH = "4065dd04ae336eb2f3bcece99bf2708b2f5ab46d6b5822bed0d32cb1feedd1df57a872b94dc9fe3e225de556c4bec0add25d7df97c983f3ff5094b9b4a21df7e"

RPROVIDES:${PN} += "bitlbee \
config-bitlbee"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libm.so.6 \
libotr.so.5 \
libpurple.so.0 \
libresolv.so.2 \
logrotate \
shadow"

inherit rpm
