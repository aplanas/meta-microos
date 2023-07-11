SUMMARY = "Development files for libdbus-c++"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop. \
This subpackage contains the files needed for building against \
libdbus-c++."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-glib-devel-0.9.1+git20170322-4.6.aarch64.rpm"
RPM_HASH = "f16b94eb5b07a4989bb8f98cced441979cee5269451fd40d5278e0e0590a70404b78cbbfacc557731e0c3ccf542c9b398c90e86a4dbe696248aa624d00214838"

RPROVIDES:${PN} += "libdbus-c++-glib-devel \
pkgconfig-dbus-c++-glib-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbus-c++-glib-1-1 \
pkgconfig-dbus-c++-1"

inherit rpm
