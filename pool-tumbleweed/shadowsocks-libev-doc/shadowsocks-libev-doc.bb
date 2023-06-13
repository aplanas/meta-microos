SUMMARY = "Documents for shadowsocks-libev"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes. \
 \
This package provides Documents for it."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.5"

RPM_NAME = "shadowsocks-libev-doc-3.3.5-3.1.noarch.rpm"
RPM_HASH = "1332d4c7f5b0e21f417d5822ad08e8a2f74463700cb6ce94cd2ac7371a38d0d54ff40d1227d0b8530c54f2ffeb54b76bb8e0be58a8af4d97ef2b361bec5b64f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shadowsocks-libev-doc"

RDEPENDS:${PN} += "shadowsocks-libev"

inherit rpm
