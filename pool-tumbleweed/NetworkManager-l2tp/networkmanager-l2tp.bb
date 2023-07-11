SUMMARY = "NetworkManager VPN support for L2TP and L2TP/IPsec"
DESCRIPTION = "This package contains software for integrating L2TP and L2TP/IPsec \
(L2TP over IPsec) VPN support with NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.8"

RPM_NAME = "NetworkManager-l2tp-1.20.8-1.6.aarch64.rpm"
RPM_HASH = "d61bd63339036e802861d4c9abd086c37c50ba4ee115a9e7e52c66d227a47fec35822ac587a41a2452f1a8fa5654fd4288bdaf5dda4ee4431eda490aa94bfb5e"

RPROVIDES:${PN} += "NetworkManager-l2tp \
libnm-vpn-plugin-l2tp.so"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
libnspr4.so \
libnss3.so \
libsmime3.so \
ppp \
xl2tpd"

inherit rpm
