SUMMARY = "Libev port of Shadowsocks"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.5"

RPM_NAME = "shadowsocks-libev-3.3.5-3.1.aarch64.rpm"
RPM_HASH = "08c13fd2639285d0fedeea084de332292d93ab6d5d8cefb793296bb113d7643283b4e49931e29a2ac4930d30803bcdab4fa64a06180321f0cfbc26780dc1d4c1"

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
