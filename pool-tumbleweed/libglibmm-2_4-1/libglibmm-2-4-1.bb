SUMMARY = "C++ Interface for Glib"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.66.6"

RPM_NAME = "libglibmm-2_4-1-2.66.6-1.1.aarch64.rpm"
RPM_HASH = "fdc60afdb5a87be610ce9d21ed0a5a2164babcdbbd9d945b623822798761a25ad19a4ef8556c6337e018ff14c6b3a4f054273659d6470b7b16a6a9ce9059c0da"

RPROVIDES:${PN} += "glibmm2 \
glibmm24 \
libglibmm-2-4-1 \
libglibmm-2.4.so.1 \
libglibmm-generate-extra-defs-2.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
