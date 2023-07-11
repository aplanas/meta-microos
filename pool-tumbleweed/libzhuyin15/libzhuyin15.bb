SUMMARY = "Intelligent Pinyin IME"
DESCRIPTION = "libpinyin is a staging joint effort of many Chinese Pinyin IME development \
teams. It is an intelligent (and universal) sentence-based Pinyin IME backend \
supporting many language models and frontends. \
 \
This package provides runtime library for libpinyin."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "libzhuyin15-2.8.1-1.4.aarch64.rpm"
RPM_HASH = "17cbb84bd06796d6bdaaf3397891cf00e0fd9e0613fae120e8a7fb433fa83fa8bcab350b6ea1d46bbbd75db23853397395145c429731ea1e1a86db6bba468cf6"

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
