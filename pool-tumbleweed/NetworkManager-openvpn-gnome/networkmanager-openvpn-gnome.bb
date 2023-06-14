SUMMARY = "NetworkManager VPN support for OpenVPN"
DESCRIPTION = "NetworkManager-openvpn provides VPN support to NetworkManager for \
OpenVPN."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.2"

RPM_NAME = "NetworkManager-openvpn-gnome-1.10.2-1.3.aarch64.rpm"
RPM_HASH = "8f8fdbb629eb7bd1b0fd68c429b1eb68e118bf9ad61f1edb900f94fb4417a4659966ac96ce941384b477475ba37555c7403def89ff380469b85c567307d55265"

RPROVIDES:${PN} += "NetworkManager-openvpn-frontend \
NetworkManager-openvpn-gnome \
libnm-gtk4-vpn-plugin-openvpn-editor.so \
libnm-vpn-plugin-openvpn-editor.so"

RDEPENDS:${PN} += "NetworkManager-openvpn \
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
