SUMMARY = "Libproxy module for PacRunner configuration"
DESCRIPTION = " \
A module to extend libproxy with capabilities to query PacRunner about \
proxy settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-config-pacrunner-0.4.18-2.1.aarch64.rpm"
RPM_HASH = "0ebb5376b6e8f7397846f535bda7ce05eb52edb015c50fb8a738cce6cc1430d2c08eecfb13899f394351f69d1432be4bd665344499f7cc04f7c986414e2708f1"

RPROVIDES:${PN} += "libproxy1-config-pacrunner \
libproxy1-config-pacrunner(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgcc_s.so.1()(64bit) \
libproxy.so.1()(64bit) \
libproxy1 \
libstdc++.so.6()(64bit)"

inherit rpm
