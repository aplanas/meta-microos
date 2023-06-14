SUMMARY = "C++ Interface for Gio"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.66.6"

RPM_NAME = "libgiomm-2_4-1-2.66.6-1.1.aarch64.rpm"
RPM_HASH = "2b66dc66c5a428f08b6ab78ea1e26e83b1c41b5f42b2251b841aa67f2d4205962462b1e80694d102732fe658c8409772e878f71320594a09d7c528c79b7c0aec"

RPROVIDES:${PN} += "libgiomm-2-4-1 \
libgiomm-2.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
