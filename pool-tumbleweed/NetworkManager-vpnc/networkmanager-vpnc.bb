SUMMARY = "NetworkManager VPN Support for vpnc"
DESCRIPTION = "NetworkManager-vpnc provides VPN support to NetworkManager for vpnc."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "NetworkManager-vpnc-1.2.8-1.7.aarch64.rpm"
RPM_HASH = "92d8f92815580d7c45f44095b77b456049d9aa6323182202612ee5ecaa9b4661003f24e0caaebc8b641f71298b75b3be6055d5f9c88a564bb471be2eb814c4a3"

RPROVIDES:${PN} += "NetworkManager-vpnc \
libnm-vpn-plugin-vpnc.so"

RDEPENDS:${PN} += "NetworkManager \
NetworkManager-vpnc-frontend \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
vpnc"

inherit rpm
