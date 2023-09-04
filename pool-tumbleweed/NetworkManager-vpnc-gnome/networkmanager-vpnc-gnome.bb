SUMMARY = "NetworkManager VPN Support for vpnc"
DESCRIPTION = "NetworkManager-vpnc provides VPN support to NetworkManager for vpnc."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "NetworkManager-vpnc-gnome-1.2.8-2.1.aarch64.rpm"
RPM_HASH = "43ed1eb7cf3285206f677472fddd4752682fd71a88fdb4754f2a4bf4fce46347a14c1d94d44ea011e881f705e3a421c5061c03c83e5070a2a5bd039617dca337"

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
