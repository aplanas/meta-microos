SUMMARY = "NetworkManager VPN Support for vpnc"
DESCRIPTION = "NetworkManager-vpnc provides VPN support to NetworkManager for vpnc."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "NetworkManager-vpnc-1.2.8-1.7.aarch64.rpm"
RPM_HASH = "92d8f92815580d7c45f44095b77b456049d9aa6323182202612ee5ecaa9b4661003f24e0caaebc8b641f71298b75b3be6055d5f9c88a564bb471be2eb814c4a3"

RPROVIDES:${PN} += "NetworkManager-vpnc \
NetworkManager-vpnc(aarch-64) \
libnm-vpn-plugin-vpnc.so()(64bit)"
RDEPENDS:${PN} += "NetworkManager \
NetworkManager-vpnc-frontend \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_2_0)(64bit) \
vpnc"

inherit rpm
