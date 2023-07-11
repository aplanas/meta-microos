SUMMARY = "Tools for libpinyin"
DESCRIPTION = "libpinyin is an intelligent (and universal) sentence-based Pinyin IME \
backend supporting many language models and frontends. \
 \
This package provides the tools used to make data files."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.1"

RPM_NAME = "libpinyin-tools-2.8.1-1.4.aarch64.rpm"
RPM_HASH = "4276517fddc22a0a03a41561b7cbc56d0804b4ba8da2ce0b5851ac10a2072853066941ad8bf9ea3406384003724c3f888c3a1b49957414a97d49961319a9ea4b"

RPROVIDES:${PN} += "libpinyin-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libkyotocabinet.so.16 \
libstdc++.so.6"

inherit rpm
