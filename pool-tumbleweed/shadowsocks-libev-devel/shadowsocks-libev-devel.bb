SUMMARY = "Development headers for shadowsocks-libev"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes. \
 \
This package provides development headers for it."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.5"

RPM_NAME = "shadowsocks-libev-devel-3.3.5-3.1.aarch64.rpm"
RPM_HASH = "58d9a72ecdaaa0f210bc08efc11e92f5ab908d30d3a1009ca7c358dec100d1dd476dd607982136b6e47f6c1288cfea881880c731e118d93f902bee61592db47b"

RPROVIDES:${PN} += "pkgconfig(shadowsocks-libev) \
shadowsocks-libev-devel \
shadowsocks-libev-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshadowsocks-libev2"

inherit rpm
