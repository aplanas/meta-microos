SUMMARY = "IRC to other Chat Networks Gateway"
DESCRIPTION = "BitlBee is a gateway between instant messaging and an IRC client. \
With it, one's IRC client program can be reused and no extra IM program \
will need to run. \
 \
This package comes with support for MSN, Jabber, Oscar and Yahoo, as well as \
enabled flood protection."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "bitlbee-3.6-4.4.aarch64.rpm"
RPM_HASH = "684d869039b41a67587d90a288ba1f26dd9ed9035763778087a54fd9c066bd4debd86c20b326956d1bcefa8f4b625fc0553b37cd8798595ee9b9e98740b89278"

RPROVIDES:${PN} += "bitlbee \
config-bitlbee"

RDEPENDS:${PN} += "/bin/sh \
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
