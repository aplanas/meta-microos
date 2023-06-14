SUMMARY = "NetworkManager VPN support for OpenConnect"
DESCRIPTION = "NetworkManager-openconnect provides VPN support to NetworkManager for \
OpenConnect, an implementation of the Cisco AnyConnect VPN system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "1.2.10"

RPM_NAME = "NetworkManager-openconnect-gnome-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "fb8cffa90dddba19a0574d16f9d056a1773c0087d3de4f55304fff44e7218713bbfb961d04dd5ff97006e08c69ead7da1d1598455896cbde36a698bf0db11eb9"

RPROVIDES:${PN} += "NetworkManager-openconnect-frontend \
NetworkManager-openconnect-gnome \
libnm-gtk4-vpn-plugin-openconnect-editor.so \
libnm-vpn-plugin-openconnect-editor.so"

RDEPENDS:${PN} += "NetworkManager-openconnect \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-base-3.so.1 \
libgcr-ui-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-4.so.1 \
libnm.so.0 \
libnma-gtk4.so.0 \
libnma.so.0 \
libopenconnect.so.5 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2"

inherit rpm
