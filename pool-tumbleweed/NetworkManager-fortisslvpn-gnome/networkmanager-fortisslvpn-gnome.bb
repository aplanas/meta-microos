SUMMARY = "GNOME files for the NetworkManager SSLVPN plugin"
DESCRIPTION = "This package contains the GNOME files for integrating \
Fortinet-compatible SSLVPN server VPN capabilities with \
NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "NetworkManager-fortisslvpn-gnome-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "49e199d7d672fc229c5bd8994f73ecd3cefcc46f4ab184a6669bc4b79cd5e22e27ffa3c1d82acdc0a81ba39a05159a132881c7949e378ee6a3e868aef0138fa7"

RPROVIDES:${PN} += "NetworkManager-fortisslvpn-gnome \
libnm-gtk4-vpn-plugin-fortisslvpn-editor.so \
libnm-vpn-plugin-fortisslvpn-editor.so"

RDEPENDS:${PN} += "NetworkManager-fortisslvpn \
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
