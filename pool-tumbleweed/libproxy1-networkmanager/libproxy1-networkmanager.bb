SUMMARY = "Libproxy module for NetworkManager configuration"
DESCRIPTION = "A module to extend libproxy with capabilities to query NetworkManager \
about network configuration changes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-networkmanager-0.4.18-2.1.aarch64.rpm"
RPM_HASH = "b497f62b22048a89a0a13b86ece1fb6ca2f8c330a73b8bb0d709c2343643a7d0a3c52a163db7e54e8598b3b4ea65fa276bc3c972372be74027e274b08dda294d"

RPROVIDES:${PN} += "libproxy1-networkmanager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libproxy1 \
libstdc++.so.6"

inherit rpm
