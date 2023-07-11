SUMMARY = "Zhuyin engine based on libzhuyin for IBus"
DESCRIPTION = "This package includes a Chinese Zhuyin (Bopomofo) input method based \
on libzhuyin for IBus."
LICENSE = "GPL-2.0-only"

PV = "1.10.2"

RPM_NAME = "ibus-libzhuyin-1.10.2-2.4.aarch64.rpm"
RPM_HASH = "e03bd6d32c578121c0130c616170c1369a14864e7e9eb985cf5b936ef099e6d0185ebc24e2851e3f4c044e70ee99819f2f8b493949d0009a40864a2b9a3644ec"

RPROVIDES:${PN} += "ibus-libzhuyin \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libstdc++.so.6 \
libzhuyin.so.15"

inherit rpm
