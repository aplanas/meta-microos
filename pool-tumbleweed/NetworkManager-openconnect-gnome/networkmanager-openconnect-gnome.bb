SUMMARY = "NetworkManager VPN support for OpenConnect"
DESCRIPTION = "NetworkManager-openconnect provides VPN support to NetworkManager for \
OpenConnect, an implementation of the Cisco AnyConnect VPN system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "1.2.10"

RPM_NAME = "NetworkManager-openconnect-gnome-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "fb8cffa90dddba19a0574d16f9d056a1773c0087d3de4f55304fff44e7218713bbfb961d04dd5ff97006e08c69ead7da1d1598455896cbde36a698bf0db11eb9"

RPROVIDES:${PN} += "NetworkManager-openconnect-frontend \
NetworkManager-openconnect-gnome \
NetworkManager-openconnect-gnome(aarch-64) \
libnm-gtk4-vpn-plugin-openconnect-editor.so()(64bit) \
libnm-vpn-plugin-openconnect-editor.so()(64bit) \
metainfo() \
metainfo(network-manager-openconnect.metainfo.xml)"

RDEPENDS:${PN} += "NetworkManager-openconnect \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcr-base-3.so.1()(64bit) \
libgcr-ui-3.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_2_0)(64bit) \
libnma-gtk4.so.0()(64bit) \
libnma-gtk4.so.0(libnma_1_8_0)(64bit) \
libnma.so.0()(64bit) \
libnma.so.0(libnma_1_8_0)(64bit) \
libopenconnect.so.5()(64bit) \
libopenconnect.so.5(OPENCONNECT_5.0)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_2)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_3)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_5)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_7)(64bit) \
libopenconnect.so.5(OPENCONNECT_5_8)(64bit) \
libsecret-1.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
