SUMMARY = "Development files for libdbus-c++"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop. \
This subpackage contains the files needed for building against \
libdbus-c++."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-glib-devel-0.9.1+git20170322-4.5.aarch64.rpm"
RPM_HASH = "bff55d1f319f1b36d9fd7c814eb99ffc350cc88f28ef694b3594b3de1edd2da866c307ca382bf84dfc4cf2be012e2bf7e809eeede2c24b3199ac10a331faada2"

RPROVIDES:${PN} += "libdbus-c++-glib-devel \
libdbus-c++-glib-devel(aarch-64) \
pkgconfig(dbus-c++-glib-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbus-c++-glib-1-1 \
pkgconfig(dbus-c++-1)"

inherit rpm
