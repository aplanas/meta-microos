SUMMARY = "Intelligent Pinyin IME"
DESCRIPTION = "libpinyin is a staging joint effort of many Chinese Pinyin IME development \
teams. It is an intelligent (and universal) sentence-based Pinyin IME backend \
supporting many language models and frontends. \
 \
This package provides runtime library for libpinyin."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "libpinyin15-2.8.1-1.4.aarch64.rpm"
RPM_HASH = "075b51294ff5e914ff35c2aa184ae000ad1c8c629cd4373a2addc3bd53518318a5ed9d64f1dd130314577e2de4da042022d3cb25bce7fec382c3a7901ca43f8e"

RPROVIDES:${PN} += "libpinyin.so.15 \
libpinyin15"

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
