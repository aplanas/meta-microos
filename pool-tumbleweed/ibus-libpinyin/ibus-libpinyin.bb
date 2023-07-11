SUMMARY = "Intelligent Pinyin engine based on libpinyin for IBus"
DESCRIPTION = "It includes a Chinese Pinyin input method and a Chinese ZhuYin (Bopomofo) input \
method based on libpinyin for IBus."
LICENSE = "GPL-3.0-or-later"

PV = "1.15.3"

RPM_NAME = "ibus-libpinyin-1.15.3-1.2.aarch64.rpm"
RPM_HASH = "dca0bfc6792cd4535be6aad5eb7e89ea6d1977cbbe41316188be67eeecd1d580e5d29207a39a9f72a9ff9faac290ed9a43047f18a70421967b2e329300c85b3e"

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
