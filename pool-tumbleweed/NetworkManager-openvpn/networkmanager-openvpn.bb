SUMMARY = "NetworkManager VPN support for OpenVPN"
DESCRIPTION = "NetworkManager-openvpn provides VPN support to NetworkManager for \
OpenVPN."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.2"

RPM_NAME = "NetworkManager-openvpn-1.10.2-1.3.aarch64.rpm"
RPM_HASH = "77019ce49c49a52d367da9c1a362fb2000f2eb238f11571040846e32f272ad2c004554238d4a9f172b3b27ad424e08b329a573f9f6aba34485e78e062b63da88"

RPROVIDES:${PN} += "NetworkManager-openvpn \
NetworkManager-openvpn(aarch-64) \
group(nm-openvpn) \
libnm-vpn-plugin-openvpn.so()(64bit) \
user(nm-openvpn)"

RDEPENDS:${PN} += "/bin/sh \
NetworkManager \
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
openvpn \
sysuser-shadow"

inherit rpm
