SUMMARY = "NetworkManager VPN support for strongSwan"
DESCRIPTION = "NetworkManager-strongswan provides VPN support to NetworkManager for \
strongSwan."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "NetworkManager-strongswan-1.5.2-1.9.aarch64.rpm"
RPM_HASH = "3bae235897daccf7b36132ad424a1ff02672cc2a5fef531ff828a22731901c640bd03b5a1e9aee52d770b19bcdcf695b11d3e9bf05be994a9a6ce87c551d15c6"

RPROVIDES:${PN} += "NetworkManager-strongswan \
NetworkManager-strongswan(aarch-64) \
libnm-vpn-plugin-strongswan.so()(64bit)"

RDEPENDS:${PN} += "NetworkManager \
NetworkManager-strongswan-frontend \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnma.so.0()(64bit) \
libnma.so.0(libnma_1_2_0)(64bit) \
strongswan-nm"

inherit rpm
