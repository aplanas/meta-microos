SUMMARY = "C++ Interface for D-Bus"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-glib-1-1-0.9.1+git20170322-4.6.aarch64.rpm"
RPM_HASH = "08f4fbf391685187b45ee27d008291ce82e1b210856660e0721f21e44d897e67a2364df68b91b3eb8bd7304031760bfdc575dcd145bb68933a0b254405bc71c3"

RPROVIDES:${PN} += "libdbus-c++-glib-1-1 \
libdbus-c++-glib-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm
