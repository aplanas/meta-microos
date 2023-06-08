SUMMARY = "NetworkManager VPN support for L2TP and L2TP/IPsec"
DESCRIPTION = "This package contains software for integrating L2TP and L2TP/IPsec \
(L2TP over IPsec) VPN support with NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.8"

RPM_NAME = "NetworkManager-l2tp-gnome-1.20.8-1.4.aarch64.rpm"
RPM_HASH = "96487e71a0f008b5e4a25bf51fed6a106685d98308683da31e6030bd4233bd7019eb0c28f3c0a4c1dc4405a497c277a3f6ed0b0db8b9dc7f2712a3ad2c85c053"

RPROVIDES:${PN} += "NetworkManager-l2tp-gnome NetworkManager-l2tp-gnome(aarch-64) libnm-gtk4-vpn-plugin-l2tp-editor.so()(64bit) libnm-vpn-plugin-l2tp-editor.so()(64bit) metainfo() metainfo(network-manager-l2tp.metainfo.xml)"
RDEPENDS:${PN} += "NetworkManager-l2tp ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtk-4.so.1()(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit) libnma-gtk4.so.0()(64bit) libnma-gtk4.so.0(libnma_1_2_0)(64bit) libnma-gtk4.so.0(libnma_1_8_0)(64bit) libnma.so.0()(64bit) libnma.so.0(libnma_1_2_0)(64bit) libnma.so.0(libnma_1_8_0)(64bit) libsecret-1.so.0()(64bit)"

inherit rpm
