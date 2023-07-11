SUMMARY = "Documents for shadowsocks-libev"
DESCRIPTION = "shadowsocks-libev is a lightweight secured SOCKS5 proxy for embedded devices and \
low-end boxes. \
 \
This package provides Documents for it."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.5"

RPM_NAME = "shadowsocks-libev-doc-3.3.5-3.2.noarch.rpm"
RPM_HASH = "540ebc8dfb97eb9362320f3030a6689fb1fcb7255b81c38e959f8ecc01e85e038694c50dcdbeeed5032758b14182824ac3f441a7e2e8735315b1715642349ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shadowsocks-libev-doc"

RDEPENDS:${PN} += "shadowsocks-libev"

inherit rpm
