SUMMARY = "Plugin for libpurple for supporting Telegram messager"
DESCRIPTION = "A libpurple plugin that adds support for the Telegram messenger."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.7"

RPM_NAME = "libpurple-plugin-telegram-1.4.7-1.12.aarch64.rpm"
RPM_HASH = "ee5a6b043cb0806c5cf802d3920f6f144059cd5eb385b01f43e280dbe1838de20ac09fd8bb9566da7abac7504e6c460d63eae5c22d3cbd52a3ac3e2d5dfdea9c"

RPROVIDES:${PN} += "libpurple-plugin-telegram \
telegram-purple"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libpng16.so.16 \
libpurple.so.0 \
libwebp.so.7 \
libz.so.1"

inherit rpm
