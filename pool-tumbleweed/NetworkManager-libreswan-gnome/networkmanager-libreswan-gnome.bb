SUMMARY = "NetworkManager VPN plugin for libreswan - GNOME files"
DESCRIPTION = "This package contains software for integrating VPN capabilities \
with the libreswan server with NetworkManager (GNOME files)."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.16"

RPM_NAME = "NetworkManager-libreswan-gnome-1.2.16-2.3.aarch64.rpm"
RPM_HASH = "ce176752079acbe8a55a16c6d759086fadac025372425594ecbc3c29dc5137ea6af23b82ba8013c70aa24c0c856fab230d44db3d91416edb6a9778cb49305edb"

RPROVIDES:${PN} += "NetworkManager-libreswan-gnome \
NetworkManager-libreswan-gnome(aarch-64) \
NetworkManager-openswan-gnome \
libnm-gtk4-vpn-plugin-libreswan-editor.so()(64bit) \
libnm-vpn-plugin-libreswan-editor.so()(64bit) \
metainfo() \
metainfo(network-manager-libreswan.metainfo.xml)"

RDEPENDS:${PN} += "NetworkManager-libreswan \
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
libnma.so.0()(64bit) \
libnma.so.0(libnma_1_2_0)(64bit) \
libsecret-1.so.0()(64bit)"

inherit rpm
