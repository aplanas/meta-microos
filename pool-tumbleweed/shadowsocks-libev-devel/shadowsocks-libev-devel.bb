SUMMARY = "Development headers for shadowsocks-libev"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes. \
 \
This package provides development headers for it."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.5"

RPM_NAME = "shadowsocks-libev-devel-3.3.5-3.2.aarch64.rpm"
RPM_HASH = "bdf259b3a47dd68f125a939d8814502fa5aeebeaf6aa769de11368b07317606a002cc7c425d7e05c6b1bccb25d763e443246955f593b94428d56a40f74b095df"

RPROVIDES:${PN} += "pkgconfig-shadowsocks-libev \
shadowsocks-libev-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshadowsocks-libev2"

inherit rpm
