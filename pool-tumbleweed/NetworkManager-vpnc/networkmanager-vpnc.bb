SUMMARY = "NetworkManager VPN Support for vpnc"
DESCRIPTION = "NetworkManager-vpnc provides VPN support to NetworkManager for vpnc."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "NetworkManager-vpnc-1.2.8-2.1.aarch64.rpm"
RPM_HASH = "2271727b6ec22dae709ab57ff6969aedc4eb9893d5b66747cb9737e3505eebb603c0d1259e339e81b265eb98f688a53576412e7bc91448c95e6faedab7b444c5"

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
