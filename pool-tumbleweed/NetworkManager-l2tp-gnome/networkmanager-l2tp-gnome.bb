SUMMARY = "NetworkManager VPN support for L2TP and L2TP/IPsec"
DESCRIPTION = "This package contains software for integrating L2TP and L2TP/IPsec \
(L2TP over IPsec) VPN support with NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.8"

RPM_NAME = "NetworkManager-l2tp-gnome-1.20.8-1.4.aarch64.rpm"
RPM_HASH = "96487e71a0f008b5e4a25bf51fed6a106685d98308683da31e6030bd4233bd7019eb0c28f3c0a4c1dc4405a497c277a3f6ed0b0db8b9dc7f2712a3ad2c85c053"

RPROVIDES:${PN} += "NetworkManager-l2tp-gnome \
libnm-gtk4-vpn-plugin-l2tp-editor.so \
libnm-vpn-plugin-l2tp-editor.so"

RDEPENDS:${PN} += "NetworkManager-l2tp \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1 \
libnm.so.0 \
libnma-gtk4.so.0 \
libnma.so.0 \
libsecret-1.so.0"

inherit rpm
