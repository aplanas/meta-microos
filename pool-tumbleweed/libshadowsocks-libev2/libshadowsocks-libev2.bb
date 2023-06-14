SUMMARY = "Libev port of Shadowsocks"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes. \
 \
This package provides libraries for it."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.5"

RPM_NAME = "libshadowsocks-libev2-3.3.5-3.1.aarch64.rpm"
RPM_HASH = "4500b7635231bda7cf98a2dab70cf3eb66be71ab034e90d363562b69d931a25596e0a608b88d732efdeedf9d6e1aea62638433f66f2c21095459b0d2bf170ca8"

RPROVIDES:${PN} += "libshadowsocks-libev.so.2 \
libshadowsocks-libev2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
libm.so.6 \
libmbedcrypto.so.7 \
libpcre.so.1 \
libsodium.so.23"

inherit rpm
