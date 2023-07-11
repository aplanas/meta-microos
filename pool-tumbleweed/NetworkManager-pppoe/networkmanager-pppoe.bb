SUMMARY = "NetworkManager plugin for ADSL connections"
DESCRIPTION = "NetworkManager plugin for ADSL connections. \
 \
This package is needed to configure PPPoE interfaces"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.8"

RPM_NAME = "NetworkManager-pppoe-1.42.8-1.1.aarch64.rpm"
RPM_HASH = "1be9eb184e415586dae7bc57f8414fda2c474ed04ed10f42afe47f8b73d79ad7f306deaaf4cf10f40afd472854dd2fa56638e90de20a8cf4339c6afc7092f50a"

RPROVIDES:${PN} += "NetworkManager-pppoe \
libnm-device-plugin-adsl.so \
libnm-ppp-plugin.so"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
ppp \
rp-pppoe"

inherit rpm
