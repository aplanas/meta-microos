SUMMARY = "FreeWnn Japanese Input System--Server Only"
DESCRIPTION = "FreeWnn is a Kana-Kanji translation system intended as a system \
powerful enough to translate entire sentences at once. \
 \
Wnn works in a client/server manner. The server portion of Wnn, or \
jserver, is used as a Kana-Kanji translation engine for clients like \
'xwnmo' and 'kinput2' (input systems for the X Window System) or for \
clients like 'Egg', which are part of Mule (MUlti-Lingual Emacs) and \
XEmacs. \
 \
This package contains only the Japanese server."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fwnn-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "1a4fad811eeff63a33d79fa79a6aed242d71f09a847434bf6e4d55dfd6c237ecc87edea95f214570a5e56ccaa318a612fd3bece62ad2681e75449394e3435afb"

RPROVIDES:${PN} += "config-fwnn \
fwnn"

RDEPENDS:${PN} += "/usr/bin/sh \
fwnncom \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libtinfo.so.6 \
libwnn.so.0 \
libwrap.so.0 \
shadow"

inherit rpm
