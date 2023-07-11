SUMMARY = "Libev port of Shadowsocks"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.5"

RPM_NAME = "shadowsocks-libev-3.3.5-3.2.aarch64.rpm"
RPM_HASH = "6bbe6e1c7af126a4fb873154a9711b7ba79dedb676ba7707f32a24d4469e029f90253fe864b9472c3b18c42515a5667d60aeb2b9e9a4dbf521acbd1956a869dd"

RPROVIDES:${PN} += "config-shadowsocks-libev \
shadowsocks-libev"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libev.so.4 \
libm.so.6 \
libmbedcrypto.so.7 \
libpcre.so.1 \
libsodium.so.23"

inherit rpm
