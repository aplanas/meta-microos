SUMMARY = "Plugin for libpurple for supporting Telegram messager"
DESCRIPTION = "A libpurple plugin that adds support for the Telegram messenger."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.7"

RPM_NAME = "libpurple-plugin-telegram-1.4.7-1.11.aarch64.rpm"
RPM_HASH = "da6e1abf76a141eed46dfda465c895d608b96ee8bca0ada4e323b03942d7591020258a76913db95398af597b5a555ac49664d10521912ebad20ea850a9c5a098"

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
