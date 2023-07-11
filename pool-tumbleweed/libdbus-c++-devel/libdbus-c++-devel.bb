SUMMARY = "Development files for libdbus-c++"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop. \
This subpackage contains the files needed for building against \
libdbus-c++."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-devel-0.9.1+git20170322-4.7.aarch64.rpm"
RPM_HASH = "44a1fbefcafbb1cdc6635d921058d4faafb222405ae2cbf20caeceb149f4402021fd129ac5753442100caa8bf3f5c89ad5bc03e9124629045f2d939aa6adb5eb"

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
