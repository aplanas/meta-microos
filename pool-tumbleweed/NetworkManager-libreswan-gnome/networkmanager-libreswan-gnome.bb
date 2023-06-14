SUMMARY = "NetworkManager VPN plugin for libreswan - GNOME files"
DESCRIPTION = "This package contains software for integrating VPN capabilities \
with the libreswan server with NetworkManager (GNOME files)."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.16"

RPM_NAME = "NetworkManager-libreswan-gnome-1.2.16-2.3.aarch64.rpm"
RPM_HASH = "ce176752079acbe8a55a16c6d759086fadac025372425594ecbc3c29dc5137ea6af23b82ba8013c70aa24c0c856fab230d44db3d91416edb6a9778cb49305edb"

RPROVIDES:${PN} += "NetworkManager-libreswan-gnome \
NetworkManager-openswan-gnome \
libnm-gtk4-vpn-plugin-libreswan-editor.so \
libnm-vpn-plugin-libreswan-editor.so"

RDEPENDS:${PN} += "NetworkManager-libreswan \
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
