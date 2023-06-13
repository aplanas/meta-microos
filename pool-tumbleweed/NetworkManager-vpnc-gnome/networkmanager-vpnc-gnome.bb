SUMMARY = "NetworkManager VPN Support for vpnc"
DESCRIPTION = "NetworkManager-vpnc provides VPN support to NetworkManager for vpnc."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "NetworkManager-vpnc-gnome-1.2.8-1.7.aarch64.rpm"
RPM_HASH = "56f1a86d40a40e5c17cc84f7e5d31f957c5bbebc3ac5a1ea0f7edc04e042d5a819cdd8626d8aa456469effdbe697617cfb69a5506a44f8a31e29b4095b1e00a0"

RPROVIDES:${PN} += "NetworkManager-vpnc-frontend \
NetworkManager-vpnc-gnome \
NetworkManager-vpnc-gnome(aarch-64) \
libnm-gtk4-vpn-plugin-vpnc-editor.so()(64bit) \
libnm-vpn-plugin-vpnc-editor.so()(64bit) \
metainfo() \
metainfo(network-manager-vpnc.metainfo.xml)"

RDEPENDS:${PN} += "NetworkManager-vpnc \
gnome-keyring \
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
libnma-gtk4.so.0()(64bit) \
libnma-gtk4.so.0(libnma_1_2_0)(64bit) \
libnma-gtk4.so.0(libnma_1_8_0)(64bit) \
libnma.so.0()(64bit) \
libnma.so.0(libnma_1_2_0)(64bit) \
libnma.so.0(libnma_1_8_0)(64bit) \
libsecret-1.so.0()(64bit)"

inherit rpm
