SUMMARY = "NetworkManager VPN support for L2TP and L2TP/IPsec"
DESCRIPTION = "This package contains software for integrating L2TP and L2TP/IPsec \
(L2TP over IPsec) VPN support with NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.8"

RPM_NAME = "NetworkManager-l2tp-1.20.8-1.4.aarch64.rpm"
RPM_HASH = "2c5c26c00d708319700a8b3140dfb88fc63094108ff51c38c0d9d34eed0d1fa5752422c4a94b21b7bad3eb6781cd33c5327d4769a526c411402fb85c5b08b015"

RPROVIDES:${PN} += "NetworkManager-l2tp \
NetworkManager-l2tp(aarch-64) \
libnm-vpn-plugin-l2tp.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
NetworkManager \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_2_0)(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.2)(64bit) \
libnss3.so(NSS_3.4)(64bit) \
libnss3.so(NSS_3.5)(64bit) \
libsmime3.so()(64bit) \
libsmime3.so(NSS_3.2)(64bit) \
ppp \
xl2tpd"

inherit rpm
