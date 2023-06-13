SUMMARY = "NetworkManager VPN support for PPTP"
DESCRIPTION = "NetworkManager-pptp provides VPN support to NetworkManager for PPTP."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.12"

RPM_NAME = "NetworkManager-pptp-gnome-1.2.12-1.3.aarch64.rpm"
RPM_HASH = "b0afe52473f266a4e4b37edca1ed0c405dedceaec6c1badec887e3158703716495db6d7256223fa42a257ca51b516e4bbbab46f5ba66e75eb28521ff6f5d147e"

RPROVIDES:${PN} += "NetworkManager-pptp-frontend \
NetworkManager-pptp-gnome \
NetworkManager-pptp-gnome(aarch-64) \
libnm-gtk4-vpn-plugin-pptp-editor.so()(64bit) \
libnm-vpn-plugin-pptp-editor.so()(64bit) \
metainfo() \
metainfo(network-manager-pptp.metainfo.xml)"

RDEPENDS:${PN} += "NetworkManager-pptp \
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
