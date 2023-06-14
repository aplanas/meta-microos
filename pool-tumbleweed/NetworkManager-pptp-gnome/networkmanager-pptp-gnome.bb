SUMMARY = "NetworkManager VPN support for PPTP"
DESCRIPTION = "NetworkManager-pptp provides VPN support to NetworkManager for PPTP."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.12"

RPM_NAME = "NetworkManager-pptp-gnome-1.2.12-1.3.aarch64.rpm"
RPM_HASH = "b0afe52473f266a4e4b37edca1ed0c405dedceaec6c1badec887e3158703716495db6d7256223fa42a257ca51b516e4bbbab46f5ba66e75eb28521ff6f5d147e"

RPROVIDES:${PN} += "NetworkManager-pptp-frontend \
NetworkManager-pptp-gnome \
libnm-gtk4-vpn-plugin-pptp-editor.so \
libnm-vpn-plugin-pptp-editor.so"

RDEPENDS:${PN} += "NetworkManager-pptp \
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
