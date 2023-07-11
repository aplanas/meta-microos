SUMMARY = "NetworkManager VPN support for L2TP and L2TP/IPsec"
DESCRIPTION = "This package contains software for integrating L2TP and L2TP/IPsec \
(L2TP over IPsec) VPN support with NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.8"

RPM_NAME = "NetworkManager-l2tp-gnome-1.20.8-1.6.aarch64.rpm"
RPM_HASH = "836e4dc1ad9093aec2310885866e18c7a345232b183beaf82589250635ebad0ee0d39c980f511748a9ee8c7e5568f94caa518587bbb38e8c01a9ee4c3a43097b"

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
