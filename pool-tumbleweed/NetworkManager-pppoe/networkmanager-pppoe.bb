SUMMARY = "NetworkManager plugin for ADSL connections"
DESCRIPTION = "NetworkManager plugin for ADSL connections. \
 \
This package is needed to configure PPPoE interfaces"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.44.0"

RPM_NAME = "NetworkManager-pppoe-1.44.0-1.1.aarch64.rpm"
RPM_HASH = "79d5b0cb32a5567af0c32d1f56e24427915b7d8555408cf001078b18f211ed65275d243774a04cc449c833d9067c01320f7b8c31c10c594a913913353011f747"

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
