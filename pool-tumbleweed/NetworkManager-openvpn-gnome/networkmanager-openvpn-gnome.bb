SUMMARY = "NetworkManager VPN support for OpenVPN"
DESCRIPTION = "NetworkManager-openvpn provides VPN support to NetworkManager for \
OpenVPN."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.2"

RPM_NAME = "NetworkManager-openvpn-gnome-1.10.2-1.3.aarch64.rpm"
RPM_HASH = "8f8fdbb629eb7bd1b0fd68c429b1eb68e118bf9ad61f1edb900f94fb4417a4659966ac96ce941384b477475ba37555c7403def89ff380469b85c567307d55265"

RPROVIDES:${PN} += "NetworkManager-openvpn-frontend \
NetworkManager-openvpn-gnome \
NetworkManager-openvpn-gnome(aarch-64) \
libnm-gtk4-vpn-plugin-openvpn-editor.so()(64bit) \
libnm-vpn-plugin-openvpn-editor.so()(64bit) \
metainfo() \
metainfo(network-manager-openvpn.metainfo.xml)"
RDEPENDS:${PN} += "NetworkManager-openvpn \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_2_0)(64bit) \
libnm.so.0(libnm_1_6_0)(64bit) \
libnma-gtk4.so.0()(64bit) \
libnma-gtk4.so.0(libnma_1_2_0)(64bit) \
libnma-gtk4.so.0(libnma_1_8_0)(64bit) \
libnma.so.0()(64bit) \
libnma.so.0(libnma_1_2_0)(64bit) \
libnma.so.0(libnma_1_8_0)(64bit) \
libsecret-1.so.0()(64bit)"

inherit rpm
