SUMMARY = "C++ Interface for D-Bus"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-glib-1-1-0.9.1+git20170322-4.5.aarch64.rpm"
RPM_HASH = "4ce2b54dc914d352eacdcdd4cd3756882397939f8e2c42b4fbc3b6a5c7118850df170c028f9ba63488998cb7625b003ea1a7925797b105537eb8210472f0f595"

RPROVIDES:${PN} += "libdbus-c++-glib-1-1 \
libdbus-c++-glib-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm
