SUMMARY = "NetworkManager VPN Support for vpnc"
DESCRIPTION = "NetworkManager-vpnc provides VPN support to NetworkManager for vpnc."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "NetworkManager-vpnc-gnome-1.2.8-1.7.aarch64.rpm"
RPM_HASH = "56f1a86d40a40e5c17cc84f7e5d31f957c5bbebc3ac5a1ea0f7edc04e042d5a819cdd8626d8aa456469effdbe697617cfb69a5506a44f8a31e29b4095b1e00a0"

RPROVIDES:${PN} += "NetworkManager-vpnc-frontend \
NetworkManager-vpnc-gnome \
libnm-gtk4-vpn-plugin-vpnc-editor.so \
libnm-vpn-plugin-vpnc-editor.so"

RDEPENDS:${PN} += "NetworkManager-vpnc \
gnome-keyring \
ld-linux-aarch64.so.1 \
libc.so.6 \
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
