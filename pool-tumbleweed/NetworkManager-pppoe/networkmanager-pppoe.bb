SUMMARY = "NetworkManager plugin for ADSL connections"
DESCRIPTION = "NetworkManager plugin for ADSL connections. \
 \
This package is needed to configure PPPoE interfaces"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-pppoe-1.42.6-2.1.aarch64.rpm"
RPM_HASH = "49cce49f2684df0c7279d6f3322622acc4e44c3c05bd13986ec64d0f1c9fdf265bc684fe7486a998a471bcab372160a836c0e6a7239237f93248f9076cd9a3b9"

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
