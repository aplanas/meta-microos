SUMMARY = "Intelligent Pinyin IME"
DESCRIPTION = "libpinyin is a staging joint effort of many Chinese Pinyin IME development \
teams. It is an intelligent (and universal) sentence-based Pinyin IME backend \
supporting many language models and frontends. \
 \
This package provides runtime library for libpinyin."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "libzhuyin15-2.8.1-1.3.aarch64.rpm"
RPM_HASH = "3b05202116850d22af1628d76f160706a3cfd5c436fabdbd822f63cae177819c73272211da1b77740a2c9f8b104e055af7e8b948e485f2e6a40b63112b4d2156"

RPROVIDES:${PN} += "libzhuyin.so.15 \
libzhuyin15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libkyotocabinet.so.16 \
libm.so.6 \
libpinyin-data \
libstdc++.so.6"

inherit rpm
