SUMMARY = "Intelligent Pinyin engine based on libpinyin for IBus"
DESCRIPTION = "It includes a Chinese Pinyin input method and a Chinese ZhuYin (Bopomofo) input \
method based on libpinyin for IBus."
LICENSE = "GPL-3.0-or-later"

PV = "1.15.2"

RPM_NAME = "ibus-libpinyin-1.15.2-1.2.aarch64.rpm"
RPM_HASH = "14b705884c7b9e36e3092c931668fffa230dde6beaaa5d87d51ca46c5bd1619f4d266f4c25715d058588f7bac34208f0b6c7859b45fb6b89ce86c9ecb75cd7d9"

RPROVIDES:${PN} += "ibus-libpinyin \
locale-ibus-zh-CN;zh-SG"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libjson-glib-1.0.so.0 \
liblua5.4.so.5 \
libopencc.so.1.1 \
libpinyin.so.15 \
libsoup-2.4.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
