SUMMARY = "C++ Interface for Glib"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.66.6"

RPM_NAME = "libglibmm-2_4-1-2.66.6-1.2.aarch64.rpm"
RPM_HASH = "6b84e45f0191e6f32111633fb2eb3aaf5ec7966680785e20c38b5def9413f966747965dbf6f386a35df67130b481c8a2ce3324361e041a7018811a5c2a7764c7"

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
