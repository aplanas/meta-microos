SUMMARY = "Tools for libpinyin"
DESCRIPTION = "libpinyin is an intelligent (and universal) sentence-based Pinyin IME \
backend supporting many language models and frontends. \
 \
This package provides the tools used to make data files."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "libpinyin-tools-2.8.1-1.3.aarch64.rpm"
RPM_HASH = "1067c3bc000c24093edf873fe3b4ea1c8dd638640d272de667acf15c3fe84e9709e34f544940db48ff5304d90721188339c6368b8350b0d7e46e6b413f6c9b07"

RPROVIDES:${PN} += "libpinyin-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libkyotocabinet.so.16 \
libstdc++.so.6"

inherit rpm
