SUMMARY = "NetworkManager VPN plugin for Fortinet compatible SSLVPN"
DESCRIPTION = "This package contains software for integrating Fortinet compatible \
SSLVPN server VPN capabilities with with NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "NetworkManager-fortisslvpn-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "1e81d7944ad0d73f14b7bc5cc5c3e3ed2bc2d430fc92e4ff3aa48ad3d557b1b14a8a1144922113e7fc52b4b2f1685e83684208b20e04f6a571fa163e6251a216"

RPROVIDES:${PN} += "NetworkManager-fortisslvpn \
libnm-vpn-plugin-fortisslvpn.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
openfortivpn \
ppp"

inherit rpm
