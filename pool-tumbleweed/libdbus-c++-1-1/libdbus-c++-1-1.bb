SUMMARY = "C++ Interface for D-Bus"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-1-1-0.9.1+git20170322-4.7.aarch64.rpm"
RPM_HASH = "d827f53d6a346e25ffb7e4683ee828d06064615e86c62495c7a53b013e478cff9a58501979efec983b57b8f9801ad2170f60d559959135f44652b481c1b03b98"

RPROVIDES:${PN} += "libdbus-c++-1-1 \
libdbus-c++-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
