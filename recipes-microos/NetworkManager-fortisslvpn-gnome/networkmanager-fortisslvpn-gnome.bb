SUMMARY = "GNOME files for the NetworkManager SSLVPN plugin"
DESCRIPTION = "This package contains the GNOME files for integrating \
Fortinet-compatible SSLVPN server VPN capabilities with \
NetworkManager."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "NetworkManager-fortisslvpn-gnome-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "49e199d7d672fc229c5bd8994f73ecd3cefcc46f4ab184a6669bc4b79cd5e22e27ffa3c1d82acdc0a81ba39a05159a132881c7949e378ee6a3e868aef0138fa7"

RPROVIDES:${PN} += "NetworkManager-fortisslvpn-gnome NetworkManager-fortisslvpn-gnome(aarch-64) libnm-gtk4-vpn-plugin-fortisslvpn-editor.so()(64bit) libnm-vpn-plugin-fortisslvpn-editor.so()(64bit) metainfo() metainfo(network-manager-fortisslvpn.metainfo.xml)"
RDEPENDS:${PN} += "NetworkManager-fortisslvpn ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtk-4.so.1()(64bit) libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit) libnma-gtk4.so.0()(64bit) libnma-gtk4.so.0(libnma_1_2_0)(64bit) libnma-gtk4.so.0(libnma_1_8_0)(64bit) libnma.so.0()(64bit) libnma.so.0(libnma_1_2_0)(64bit) libnma.so.0(libnma_1_8_0)(64bit) libsecret-1.so.0()(64bit)"

inherit rpm
