SUMMARY = "NetworkManager VPN support for strongSwan"
DESCRIPTION = "NetworkManager-strongswan provides VPN support to NetworkManager for \
strongSwan."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "NetworkManager-strongswan-1.5.2-1.9.aarch64.rpm"
RPM_HASH = "3bae235897daccf7b36132ad424a1ff02672cc2a5fef531ff828a22731901c640bd03b5a1e9aee52d770b19bcdcf695b11d3e9bf05be994a9a6ce87c551d15c6"

RPROVIDES:${PN} += "NetworkManager-strongswan \
libnm-vpn-plugin-strongswan.so"

RDEPENDS:${PN} += "NetworkManager \
NetworkManager-strongswan-frontend \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnm.so.0 \
libnma.so.0 \
strongswan-nm"

inherit rpm
