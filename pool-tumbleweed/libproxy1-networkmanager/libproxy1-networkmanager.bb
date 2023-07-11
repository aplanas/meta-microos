SUMMARY = "Libproxy module for NetworkManager configuration"
DESCRIPTION = "A module to extend libproxy with capabilities to query NetworkManager \
about network configuration changes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-networkmanager-0.4.18-2.3.aarch64.rpm"
RPM_HASH = "d48ded9cf95f06fc4e22cb6d9db2b06def4a52057fc38882c6c2f37cb2c5126d8c87ad7e4994861841635f4b47650f40f289d7b9197b4e226502c0813053fecb"

RPROVIDES:${PN} += "libproxy1-networkmanager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libproxy1 \
libstdc++.so.6"

inherit rpm
