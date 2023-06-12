SUMMARY = "Libev port of Shadowsocks"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.5"

RPM_NAME = "shadowsocks-libev-3.3.5-3.1.aarch64.rpm"
RPM_HASH = "08c13fd2639285d0fedeea084de332292d93ab6d5d8cefb793296bb113d7643283b4e49931e29a2ac4930d30803bcdab4fa64a06180321f0cfbc26780dc1d4c1"

RPROVIDES:${PN} += "config(shadowsocks-libev) \
shadowsocks-libev \
shadowsocks-libev(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcares.so.2()(64bit) \
libev.so.4()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmbedcrypto.so.7()(64bit) \
libpcre.so.1()(64bit) \
libsodium.so.23()(64bit)"

inherit rpm
