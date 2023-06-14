SUMMARY = "Development files for libdbus-c++"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop. \
This subpackage contains the files needed for building against \
libdbus-c++."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-devel-0.9.1+git20170322-4.6.aarch64.rpm"
RPM_HASH = "1a410de29d985fa5aa4fd6843f384664556e5bd5084aa59192e77a347cd2ea848abda80e1e7872ad90db9eb95582d7daf015397c69658a34f1a2fef58784d21c"

RPROVIDES:${PN} += "libdbus-c++-devel \
pkgconfig-dbus-c++-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-c++-1-1 \
libdbus-c++-1.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
pkgconfig-dbus-1"

inherit rpm
