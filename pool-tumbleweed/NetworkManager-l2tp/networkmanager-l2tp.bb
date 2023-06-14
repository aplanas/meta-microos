SUMMARY = "NetworkManager VPN support for L2TP and L2TP/IPsec"
DESCRIPTION = "This package contains software for integrating L2TP and L2TP/IPsec \
(L2TP over IPsec) VPN support with NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.8"

RPM_NAME = "NetworkManager-l2tp-1.20.8-1.4.aarch64.rpm"
RPM_HASH = "2c5c26c00d708319700a8b3140dfb88fc63094108ff51c38c0d9d34eed0d1fa5752422c4a94b21b7bad3eb6781cd33c5327d4769a526c411402fb85c5b08b015"

RPROVIDES:${PN} += "NetworkManager-l2tp \
libnm-vpn-plugin-l2tp.so"

RDEPENDS:${PN} += "/bin/sh \
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
