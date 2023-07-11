SUMMARY = "C++ Interface for Glib"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.0"

RPM_NAME = "libglibmm-2_68-1-2.76.0-1.2.aarch64.rpm"
RPM_HASH = "9da9becb8919da1773ff99ecb146a54a90ebb124b0644046e72ac4f2f387cf0b45f85c2f7995c3b53a960bc04fefcec2d6d760350927dcf6042e16ceb74dafaa"

RPROVIDES:${PN} += "libglibmm-2-68-1 \
libglibmm-2.68.so.1 \
libglibmm-generate-extra-defs-2.68.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
