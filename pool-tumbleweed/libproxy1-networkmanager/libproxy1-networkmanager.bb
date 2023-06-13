SUMMARY = "Libproxy module for NetworkManager configuration"
DESCRIPTION = "A module to extend libproxy with capabilities to query NetworkManager \
about network configuration changes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-networkmanager-0.4.18-2.1.aarch64.rpm"
RPM_HASH = "b497f62b22048a89a0a13b86ece1fb6ca2f8c330a73b8bb0d709c2343643a7d0a3c52a163db7e54e8598b3b4ea65fa276bc3c972372be74027e274b08dda294d"

RPROVIDES:${PN} += "libproxy1-networkmanager \
libproxy1-networkmanager(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libproxy1 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
