SUMMARY = "C++ Interface for D-Bus"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-1-1-0.9.1+git20170322-4.6.aarch64.rpm"
RPM_HASH = "09933d78f017993879b08797c381427eed5fcabb46d7d35a5bc9d59f21da461d3637ce3e859c67e6353f3a3f686ec67988c8ba496b634d5846d37098a17bf2ab"

RPROVIDES:${PN} += "libdbus-c++-1-1 \
libdbus-c++-1-1(aarch-64) \
libdbus-c++-1.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
