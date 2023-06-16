SUMMARY = "Zhuyin engine based on libzhuyin for IBus"
DESCRIPTION = "This package includes a Chinese Zhuyin (Bopomofo) input method based \
on libzhuyin for IBus."
LICENSE = "GPL-2.0-only"

PV = "1.10.2"

RPM_NAME = "ibus-libzhuyin-1.10.2-2.3.aarch64.rpm"
RPM_HASH = "95cabb0c4d8ad0f8384fea2fa180115ba0ec175e40545d45c20326f978e7e0cea662b1bed1a62fde507f070312fe3610b4607a89afa44e3faebf49e61c6d3490"

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
